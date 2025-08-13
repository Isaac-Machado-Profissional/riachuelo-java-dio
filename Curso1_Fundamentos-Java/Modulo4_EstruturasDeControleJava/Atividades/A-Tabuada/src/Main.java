import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número qualquer para verificar sua igualitária tabuada: ");
        var number = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            var tabuada = number * i;
            System.out.printf("O valor da tabuada de %s x %s é %s \n", number, i, tabuada);
        }
    }
}