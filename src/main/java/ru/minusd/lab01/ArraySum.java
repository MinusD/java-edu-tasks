package ru.minusd.lab01;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        int sum = 0;

        int i;
        for(i = 0; i < n; ++i) {
            data[i] = scanner.nextInt();
        }

        for(i = 0; i < n; ++i) {
            sum += data[i];
        }

        System.out.println(sum);
        sum = 0;

        for(i = 0; i < n; ++i) {
            sum += data[i];
        }

        System.out.println(sum);
        i = 0;
        sum = 0;

        do {
            sum += data[i];
            ++i;
        } while(i < n);

        System.out.println(sum);
    }
}
