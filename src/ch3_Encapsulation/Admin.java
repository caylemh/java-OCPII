package ch3_Encapsulation;

public class Admin extends Employee {

    private String directManager;

    public Admin(int empId, String name, String ssn, double salary, String directManager) {
        super(empId, name, ssn, salary);
        this.directManager = directManager;
    }

    public String getDirectManager() {
        return directManager;
    }
}
