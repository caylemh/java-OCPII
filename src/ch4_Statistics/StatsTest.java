package ch4_Statistics;

public class StatsTest {
    public static void main(String[] args) {
        Statistics stats = new Statistics();

        float average = stats.average(2,3,67,8,3,4,5); // Using the varargs notation. Treats the 'nums' parameter as an array.

        System.out.println("The average of the arrays = " + average );
    }
}
