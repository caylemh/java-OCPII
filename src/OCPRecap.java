public class OCPRecap {
    public static void main(String[] args) {
        //Normal ForLoop
//        for (int i=0; i<9; i++) {
//            System.out.println("i: " +i);
//        }

        // Enhanced ForLoop
        int[] numbers = {12,34,3,5,6,4,7,8,9};

        for (int number:numbers) {
            System.out.println("Number: " +number);
        }
    }
}
