package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[5];
        names[0] = "Alexander";
        System.out.println(names[0]);
        names[1] = "Konstantin";
        System.out.println(names[1]);
        names[2] = "Oleg";
        System.out.println(names[2]);
        names[3] = "Sergey";
        System.out.println(names[3]);
        names[4] = "Maxim";
        System.out.println(names[4]);

    }
}
