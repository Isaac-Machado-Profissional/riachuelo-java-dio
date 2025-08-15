import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrganizandoEstoque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String saida = organizarEstoque(entrada);

        System.out.println(saida);

        scanner.close();
    }

    public static String organizarEstoque(String entrada) {
        // Mapa para armazenar o total de cada código mantendo a ordem de aparição
        Map<String, Integer> estoque = new LinkedHashMap<>();

        // Quebra a string em cada loja
        String[] lojas = entrada.split(",");

        for (String loja : lojas) {
            String[] partes = loja.split(":");
            String codigo = partes[0].trim();
            int quantidade = Integer.parseInt(partes[1].trim());

            // Atualiza a quantidade total no mapa
            estoque.put(codigo, estoque.getOrDefault(codigo, 0) + quantidade);
        }

        // Monta a string de saída no formato "codigo:quantidade"
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            sb.append(entry.getKey())
                    .append(":")
                    .append(entry.getValue())
                    .append(",");
        }

        // Remove a última vírgula, se houver
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}
