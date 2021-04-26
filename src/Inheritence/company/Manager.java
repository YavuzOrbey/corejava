package Inheritence.company;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        basicSalary = salary;
    }
    @Override
    public double calculateTransportAllowance() {
        double transportAllowance = 15 * basicSalary/100;
        return transportAllowance;
    }
}
