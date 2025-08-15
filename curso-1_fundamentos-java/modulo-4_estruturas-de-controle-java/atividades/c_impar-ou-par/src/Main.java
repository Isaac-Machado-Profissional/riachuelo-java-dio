import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números para verificar todos os PARES ou ÍMPARES entre eles.");

        System.out.print("Informe o primeiro número: ");
        int number1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int number2 = scanner.nextInt();

        System.out.print("Deseja verificar {IMPAR} ou {PAR}? ");
        String tipo = scanner.next();

        System.out.println("Todos os possíveis números ganhadores são: ");

        // garante que number1 seja menor que number2
        int inicio = Math.min(number1, number2);
        int fim = Math.max(number1, number2);

        if (tipo.equalsIgnoreCase("ímpar") || tipo.equalsIgnoreCase("impar")) {
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 != 0) { // ímpar
                    System.out.print(i + " ");
                }
            }

        } else if (tipo.equalsIgnoreCase("par")) {
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 == 0) { // par
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
