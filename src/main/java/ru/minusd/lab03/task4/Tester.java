package ru.minusd.lab03.task4;

public class Tester {
    public static void main(String[] args) {
        var shop = new Shop();
        shop.append(new Computer("Test 1"));
        shop.append(new Computer("Test 2"));
        shop.append(new Computer("Test 3"));
        shop.append(new Computer("Test 4"));
        shop.append(new Computer("Test 5"));

        for (var computer : shop.getData()){
            System.out.println(computer.toString());
        }
    }
}
