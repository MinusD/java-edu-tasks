package ru.minusd.lab02;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        // Entering data
        int len = sc.nextInt(), from = sc.nextInt();
        int outCounter = 0, current = 1, a = 0, b = 1, c;

        while (outCounter < len) {
            c = a + b;
            if (current >= from) {
                System.out.println(c);
                outCounter++;
            }
            b = a;
            a = c;
            current++;
        }
    }
}
