import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho de um dos lados do quadrado: ");
        var quadrado = scanner.nextInt();

        var raizQuadrada = quadrado * quadrado;

        System.out.printf("Área total do quadrado visto: %s", raizQuadrada);

    }
}