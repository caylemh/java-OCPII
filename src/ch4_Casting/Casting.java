package ch4_Casting;

import ch4.Employee;
import ch4.Manager;

public class Casting {
    public static void main(String[] args) {
        Employee e = new Manager(102, "Joan Kelsey","012-234-5678",110_456.9,"Marketing");

        if (e instanceof Manager) {
            Manager m = (Manager) e;
            m.setDeptName("HR");
            System.out.println(m.getDetails());
        }
    }

}
