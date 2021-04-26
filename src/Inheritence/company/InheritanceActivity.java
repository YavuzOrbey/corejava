package Inheritence.company;

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        System.out.println("Manager Salary: " + manager.calculateSalary());
        Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        System.out.println("Trainee Salary: " + trainee.calculateSalary());

        System.out.println("Manager Transport Allowance: " + manager.calculateTransportAllowance());
        System.out.println("Trainee Transport Allowance: " + trainee.calculateTransportAllowance());
    }
}
