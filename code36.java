//import java.util.InputMismatchException;
//import java.util.Scanner;
import java.util.*;
import java.io.*;

class Demo {
    static int x = 0;
    static int y = 0;

    static void fun() {
        System.out.println("START FUN");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER VALUE FOR X AND Y");
            try {
                x = sc.nextInt();
                y = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("INPUT MISMATCH EXCEPTION");
                sc.nextLine();  // clear the buffer
            }

            try {
                if (y == 0) {
                    System.out.println("DIVISION BY ZERO EXCEPTION");
                } else {
                    System.out.println(x / y);
                }
            } catch (ArithmeticException e) {
                System.out.println("ARITHMETIC EXCEPTION");
            }

            System.out.println("ENTER VALUE FOR X AND Y AGAIN");
            try {
                x = sc.nextInt();
                y = sc.nextInt();
                if (y == 0) {
                    System.out.println("DIVISION BY ZERO EXCEPTION");
                } else {
                    System.out.println(x / y);
                }
            } catch (InputMismatchException e) {
                System.out.println("INPUT MISMATCH EXCEPTION");
            } catch (ArithmeticException e) {
                System.out.println("ARITHMETIC EXCEPTION");
            }
        }

        System.out.println("END FUN");
    }

    public static void main(String[] args) {
        System.out.println("START MAIN");
        Demo obj = new Demo();
        obj.fun();
        System.out.println("END MAIN");
    }
}
