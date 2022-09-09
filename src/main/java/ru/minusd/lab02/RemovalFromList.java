package ru.minusd.lab02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RemovalFromList {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int size = sc.nextInt();
        var data = new ArrayList<Integer>(size);

        // Generate random list
        for (int i = 0; i < size; i++)
            data.add(i, ThreadLocalRandom.current().nextInt(100));

        // Remove full numbers
        showList(data);
        int fullNumber = sc.nextInt();
        data.removeIf(elem -> elem == fullNumber);
        showList(data);

        // Removing ending numbers
        int num = sc.nextInt();
        data.removeIf(elem -> elem % 10 == num);
        showList(data);
    }

    public static void showList(ArrayList<Integer> data) {
        System.out.println("List size: " + data.size());
        for (Integer datum : data) System.out.print(datum + " ");
        System.out.println();
    }
}
