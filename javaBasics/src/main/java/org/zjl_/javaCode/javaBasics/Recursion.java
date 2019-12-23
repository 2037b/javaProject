package javaCode.javaBasics;

public class Recursion {
    int Factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Recursion().Factorial(10));
    }
}
