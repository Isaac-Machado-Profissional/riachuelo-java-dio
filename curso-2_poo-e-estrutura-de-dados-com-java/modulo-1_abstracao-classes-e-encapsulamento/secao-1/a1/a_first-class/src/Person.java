import java.time.OffsetDateTime;

public class Person {

    private final String name;
    private int age;
    private int lastYearAgeInc = OffsetDateTime.now().getYear() -1;


    public String getName() {
        return this.name;
    }

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return this.age;
    }


    public void incAge() {
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age +=1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }












}
