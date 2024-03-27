package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                Integer.parseInt(
                        scanner.next()) + Integer.parseInt(scanner.next()
                )
        );
        scanner.close();
    }


}

class A {

    private int a;

    public void invokeB() {
        B objB = new B(); // (1)
        int b = objB.b;   // (2)
        int c = objB.c;   // (3)
    }
}

public class B {

    private int b;
    int c;

    public void invokeA() {
        A objA = new A(); // (4)
        int a = objA.a;   // (5)
    }
}
