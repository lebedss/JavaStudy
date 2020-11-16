package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int tmp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = tmp;
        }
        return array;
    }
}