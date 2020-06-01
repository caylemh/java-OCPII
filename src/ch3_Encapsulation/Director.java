package ch3_Encapsulation;

public class Director extends Manager{
    private int subManagers;

    public Director(int empId, String name, String ssn, double salary, String deptName, int subManagers) {
        super(empId, name, ssn, salary, deptName);
        this.subManagers = subManagers;
    }

    public int getSubManagers() {
        return subManagers;
    }
}
