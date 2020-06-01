package ch3_Encapsulation;

public class Engineer extends Employee{
    private String engineerType;

    public Engineer(int empId, String name, String ssn, double salary, String engineerType) {
        super(empId, name, ssn, salary);
        this.engineerType = engineerType;
    }

    public String getEngineerType() {
        return engineerType;
    }
}
