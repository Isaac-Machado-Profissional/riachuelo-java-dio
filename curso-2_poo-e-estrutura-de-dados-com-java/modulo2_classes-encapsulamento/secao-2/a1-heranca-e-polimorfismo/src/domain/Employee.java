package domain;

public sealed abstract class Employee permits Manager, Salesman {

    protected String code;

    protected String name;

    protected String adress;

    protected int age;

    protected double salary;

    public Employee(
            String code,
            String name,
            String adress,
            int age,
            double salary) {
        this.code = code;
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Terá que ter implementação posterior por ser uma classe que não implementa, mas pode ser implementado posteriormente por outra
    public abstract double getFullSalary();

    ///  Sobrecarga de métoodo, pegando mesmo getFullSalary e adicionando
    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }


}
