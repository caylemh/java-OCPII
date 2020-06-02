package ch4_StaticVarMethod;

import java.time.LocalDate;

public class StaticHelper {
    public static void main(String[] args) {
        double d = Math.random();
        printMessage("Hello Caylem, how are you?");
    }

    public static void printMessage(String msg) {
        System.out.println("Message for " + LocalDate.now() + ": " + msg);
    }
}
