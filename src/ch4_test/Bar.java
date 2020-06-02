package ch4_test;

import ch4_demo.foo;

public class Bar extends foo {
        private int sum = 10;
        public void reportSum() {
            sum += getResult();
        }

    public static void main(String[] args) {
        Bar b = new Bar();

        System.out.println("Foo Class Result: " + b.getResult());
    }
}
