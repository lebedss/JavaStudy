package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int tmp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = tmp;
        }
        return array;
    }
}