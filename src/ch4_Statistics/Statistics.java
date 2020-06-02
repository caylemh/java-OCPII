package ch4_Statistics;

public class Statistics {
    public float average(int... nums) {
        int sum = 0;
        for(int x: nums) {
            sum += x;
        }
        return ((float) sum/ nums.length);
    }
}
