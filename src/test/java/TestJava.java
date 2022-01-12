package test.java;

import org.testng.annotations.Test;

public class TestJava {
    @Test
public static void main (String [] args) {

    int num1 = 6;
    int num2 = 6;

    int result = num1 + num2;

    System.out.println(result);


    }
    @Test
    public static void main() {
        int num1 = 8;
        int num2 = 5;

        int result = num1 + num2;

        System.out.println(result);
    }
    @Test
    public static void m  () {
        int num1 = 10;
        int num2 = 4;
        int result = num1 - num2;
        System.out.println(result);

    }
    @Test
    public static void ma  () {
        int num1 = 6;
        int num2 = 3;
        int result = num1 / num2;
        System.out.println(result);
    }
    @Test
    public static void mav () {
        int num1 = 4;
        int num2 = 2;
        int result = num1 * num2;
        System.out.println(result);
    }

}
