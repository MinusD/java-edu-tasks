package ru.minusd.lab03.task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Computer> data;

    public void append(Computer computer) {
        data.add(computer);
    }

    public Shop() {
        data = new ArrayList<Computer>();
    }

    public List<Computer> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "data=" + data +
                '}';
    }
}
