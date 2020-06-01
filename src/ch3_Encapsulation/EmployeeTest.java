package ch3_Encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {

        Manager mgr = new Manager(123,"Helen Bradley","1033-445-6678",
                            20000, "Marketing");

        System.out.println("\nManager No: " + mgr.getEmpId() +
                            "\n\tName: " + mgr.getName() +
                            "\n\tSSN: " + mgr.getSsn() +
                            "\n\tSalary: " + mgr.getSalary() +
                            "\n\tDepartment: " + mgr.getDeptName());

        // Change the details
        mgr.raiseSalary(10000);
        mgr.changeName("Helen Cooper");

        System.out.println("\nManager No: " + mgr.getEmpId() +
                "\n\tName: " + mgr.getName() +
                "\n\tSSN: " + mgr.getSsn() +
                "\n\tSalary: " + mgr.getSalary() +
                "\n\tDepartment: " + mgr.getDeptName());

        Admin adm1 = new Admin(23456, "Jane Fonda", "2311234",
                        10000, "Andrew Galant");
        System.out.println("\nAdministrator No: " + adm1.getEmpId() +
                "\n\tName: " + adm1.getName() +
                "\n\tSSN: " + adm1.getSsn() +
                "\n\tSalary: " + adm1.getSalary() +
                "\n\tManager: " + adm1.getDirectManager());

        Director dir1 = new Director(667789, "John Holly", "99988706",
                            45000, "Marketing", 5);
        System.out.println("\nDirector No: " + dir1.getEmpId() +
                "\n\tName: " + dir1.getName() +
                "\n\tSSN: " + dir1.getSsn() +
                "\n\tSalary: " + dir1.getSalary() +
                "\n\tDepartment: " + dir1.getDeptName() +
                "\n\tSubordinate No: " + dir1.getSubManagers());

        Engineer eng1 = new Engineer(22345, "James Hurtley", "33445678",
                            25000, "Processing & Control");
        System.out.println("\nEngineer No: " + eng1.getEmpId() +
                "\n\tName: " + eng1.getName() +
                "\n\tSSN: " + eng1.getSsn() +
                "\n\tSalary: " + eng1.getSalary() +
                "\n\tEngineer Type: " + eng1.getEngineerType());

        eng1.raiseSalary(2000);
        System.out.println("\nEngineer No: " + eng1.getEmpId() +
                            "\n\tNew Salary: " + eng1.getSalary());
    }
}

