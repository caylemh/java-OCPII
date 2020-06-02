package ch4;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getDetails() {
        return "ID: " + empId + " Name: " + name;
    }

    public String getAllDetails() {
        return "ID: " + empId + " Name: " + name
                + " SSN: " + ssn + " Salary: " + salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public double calcBonus() {
        return this.getSalary() * GoodBonus.calcBonus(this);
    }

    public String toString() {
        return "\nEmployee ID: " + empId + "\n" +
                "Employee Name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if((obj != null) && (obj instanceof Employee)) {
            Employee e = (Employee)obj;
            if((e.empId == this.empId) &&
                    (e.name.equals(this.name)) &&
                    (e.ssn.equals(this.ssn)) &&
                    (e.salary == this.salary)) {
                result = true;
            }
        }
        return result;
    }
}
