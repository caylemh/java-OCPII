public class OCP_I_Review {
    public static void main(String[] args) {
        //Normal ForLoop
//        for (int i=0; i<9; i++) {
//            System.out.println("i: " +i);
//        }

        // Enhanced ForLoop
//        int[] numbers = {12,34,3,5,6,4,7,8,9};
//
//        for (int number:numbers) {
//            System.out.println("Number: " +number);
//        }

        // Using StringBuilder
//        StringBuilder sb = new StringBuilder("hello");
//        System.out.println("string sb = " + sb);
//        sb.append(" world");
//        System.out.println("string sb = " + sb);
//
//        sb.append("!").append(" are").append(" you?");
//        System.out.println("string sb = " + sb);
//
//        sb.insert(12," How");
//        System.out.println("string sb = " +sb);
//
//        //Get Length
//        System.out.println("Length: " + sb.length());
//
//        //Get substring
//        System.out.println("Sub: " + sb.substring(0,5));

        //Classes and Methods
        Employee emp = new Employee ();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSsn ("012-34-5678");
        emp.setSalary(120_345.27);
        System.out.println ("Employee id:         " + emp.getEmpId());
        System.out.println ("Employee name:       " + emp.getName());
        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println ("Employee salary:     " + emp.getSalary());
    }
}
