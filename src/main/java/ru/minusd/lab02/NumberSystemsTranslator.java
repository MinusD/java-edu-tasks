package ru.minusd.lab02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberSystemsTranslator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int base = scanner.nextInt();

        translator(num, 2);
        translator(num, 16);
        translator(num, base);
    }

    public static void translator(double num, int base) {
        String sysBuffer = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        ArrayList<Integer> int_part = new ArrayList<>();
        ArrayList<Integer> fractional_part = new ArrayList<>();

        // Start Translate
        int intVal = (int) num;
        num = num - (double) intVal;

        int i = 0;
        while (intVal != 0) {
            int_part.add(intVal % base);
            intVal /= base;
        }
        Collections.reverse(int_part);

        for (int j = 0; j < 3; j++) {
            fractional_part.add((int) (num * base));
            num = (num * base) - (int) (num * base);
        }

        // Outputting number
        for (Integer el : int_part) System.out.print(sysBuffer.charAt(el));
        System.out.print(",");
        for (Integer el : fractional_part) System.out.print(sysBuffer.charAt(el));
        System.out.println();
    }
}
