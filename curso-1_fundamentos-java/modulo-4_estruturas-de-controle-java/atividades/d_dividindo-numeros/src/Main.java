import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        var number = scanner.nextInt();
        var keepVerify = true;

        while (keepVerify) {
            System.out.println("\nInforme o número para verificação: ");
            var toVerify = scanner.nextInt();
            if (toVerify < number) {
                System.out.printf("Informe um número maior que %s \n", number);
                continue;
            }

            var result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s", toVerify, number, result);
        }

    }
}