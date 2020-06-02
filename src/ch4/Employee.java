package ch4;

import java.util.Objects;

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
        return "ID: " + empId + "\n\tName: " + name;
    }

    public String getAllDetails() {
        return "\nID: " + empId + "\n\tName: " + name
                + "\n\tSSN: " + ssn + "\n\tSalary: " + salary;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.empId;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.ssn);
        hash = 83 * hash + (int)
                (Double.doubleToLongBits(this.salary) ^
                        (Double.doubleToLongBits(this.salary) >>> 32));
        return hash;
    }
}
