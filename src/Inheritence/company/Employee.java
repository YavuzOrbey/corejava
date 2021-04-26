package Inheritence.company;

public class Employee {
    final int i = 0;
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    public Employee(){

    }

    public Employee(long id, String name, String address, long phone){
        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeeePhone = phone;
    }

    public double calculateSalary(){
        double salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*hra/100);
        return salary;
    }

    public double calculateTransportAllowance(){
        double transportAllowance = 10 * basicSalary/100;
        return transportAllowance;
    }
}
