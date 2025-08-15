import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a altura do retângulo: ");
        var alturaRetangulo = scanner.nextInt();

        System.out.println("Informe a largura do retângulo: ");
        var larguraRetangulo = scanner.nextInt();

        var areaRetangulo = alturaRetangulo * larguraRetangulo;
        System.out.printf("Área total do quadrado visto: %s", areaRetangulo);

    }
}