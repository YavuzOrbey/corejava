package Inheritence.company;

public class Trainee extends Employee {
    int i = 3;
    public Trainee() {
    }

    public Trainee(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        basicSalary = salary;
    }
}
