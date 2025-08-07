import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        var nomePessoa1 = scanner.nextLine();

        System.out.println("Digite a idade da primeira pessoa: ");
        var idadePessoa1 = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        System.out.println("Digite o nome da segunda pessoa: ");
        var nomePessoa2 = scanner.nextLine();

        System.out.println("Digite a idade da segunda pessoa: ");
        var idadePessoa2 = scanner.nextInt();

        var diferencaIdade = Math.abs(idadePessoa1 - idadePessoa2);
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.%n", nomePessoa1, nomePessoa2, diferencaIdade);
    }
}
