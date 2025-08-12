import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome:"; // Constant

    public static void main(String[] args) {

        var scanner = new Scanner(System.in); // Inicializei
        System.out.println(WELCOME_MESSAGE);
        var name = scanner.next();

        System.out.println("informe sua idade: ");
        var age = scanner.nextInt();
        System.out.printf("Olá %s, sua idade é %s", name, age);

    }
}