package ch4_StaticVarMethod;

public class StaticCounter {
    private static int counter = 0;

    public static void main(String[] args) {
        double p = Math.PI;

        System.out.println("Start: " + getCount());
        increment();
        increment();
        System.out.println("End: " + getCount());
    }

    public static int getCount() {
        return counter;
    }

    public static void increment() {
        counter++;
    }
}
