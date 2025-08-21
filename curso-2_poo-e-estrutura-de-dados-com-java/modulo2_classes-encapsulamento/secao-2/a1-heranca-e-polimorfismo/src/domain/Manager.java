package domain;

public non-sealed class Manager extends Employee {

    private String login;


    private String password;

    private double commission;

    @Override
    public String getCode() {
        return "MN" + super.getCode();
    }

    /// Sobrescrita override
    @Override
    public double getFullSalary() {
        return this.salary + this.commission;
    }


    public Manager(String code,
                   String name,
                   String adress,
                   int age,
                   double salary,
                   String login,
                   String password,
                   double comission) {
        super(code, name, adress, age, salary);
        this.login = login;
        this.password = password;
        this.commission = comission;
    }

    public Manager() {
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }



}
