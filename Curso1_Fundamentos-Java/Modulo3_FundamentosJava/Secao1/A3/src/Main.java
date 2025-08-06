import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt(); // Aguardar a resposta

        System.out.println("Você é emancipado?");
        var isEmpacipated = scanner.nextBoolean();

        var canDrive = age >= 18 || (isEmpacipated && age >= 16);
        System.out.printf("Você pode dirigir? (%s)\n", canDrive);


    }
}