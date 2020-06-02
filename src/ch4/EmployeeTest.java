package ch4;

public class EmployeeTest {
    public static void main(String args[]) {

        Employee emp1 = new Employee(121, "Ron", "111-11-1111", 5000);
        System.out.println("Employee 1:  " + emp1.getDetails());

        Employee emp2 = new Employee(122, "ken", "222-22-2222", 6000);
        System.out.println("Employee 2:  " + emp2.getDetails());

        // Overriding the 'equals' method
        Employee x = new Employee(1,"Sue","111-111-1111",10.0);
        Employee y = x;

        Employee z = new Employee(1,"Sue","111-111-1111", 10.0);


        if(x.equals(y)) {
            System.out.println("True");
        }

        if(x.equals(z)) {
            System.out.println("True");
        } else System.out.println("False");
    }
}
