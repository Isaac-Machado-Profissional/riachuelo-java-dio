import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        String alturaInput = scanner.nextLine().replace(',', '.');
        float altura = Float.parseFloat(alturaInput);

        System.out.println("Digite o seu peso: ");
        String pesoInput = scanner.nextLine().replace(',', '.');
        float peso = Float.parseFloat(pesoInput);

        var IMC = peso / (altura * altura);

        if (IMC <= 18.5) {
            System.out.println("Você está abaixo do peso!");
        }

        else if (IMC > 18.5 & IMC < 24.9) {
            System.out.println("Você está no peso ideal do peso!");

        }

        else if (IMC > 25.0 & IMC < 30.0) {
            System.out.println("Levemente acima do peso!");
        }

        else if (IMC > 30.0 & IMC < 35.0) {
            System.out.println("Obesidade grau I");
        }

        else if (IMC > 35.0 & IMC < 40.0) {
            System.out.println("Obesidade grau II(Severa)");
        }

        else if (IMC > 40) {
            System.out.println("Obesidade grau III(Mórbida)");
        }
    }
}