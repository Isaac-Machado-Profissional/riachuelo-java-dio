import java.util.Scanner;

public class Main {

    // Métoodo com static => indica que não vamos intanciá-la, e sim chamar seu objeto o que está naquela variável

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var male = new Person("João");
        male.incAge();


        var female = new Person("Maria");
        female.incAge();


        System.out.println("Male name: " + male.getName() +  " age " + male.getAge());
        System.out.println("Female name: " + female.getName() +  " age " + female.getAge());

    }
}