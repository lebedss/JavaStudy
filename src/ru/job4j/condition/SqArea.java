package ru.job4j.condition;

public class SqArea {
    public static int square (int p, int k) {
        int h = (p / (2 * (k + 1)));
        int L = h * k;
        return L * h;
    }

    public static void main(String[] args) {
        int result = SqArea.square(6, 2);
        System.out.println(" площадь прямоугольника " + result);
    }
}
