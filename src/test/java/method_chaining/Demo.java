package method_chaining;

import java.io.PrintStream;

public class Demo {

    public static void main(String[] args) {
        System.out.println("My name is Kaveesha");

        PrintStream printStream = System.out;
        printStream.println("My name is Kaveesha 1");
    }
}
