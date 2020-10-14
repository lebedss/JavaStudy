package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = (p / (2 * (k + 1)));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6.5, 5.5);
        System.out.println(" площадь прямоугольника " + result + " см2 ");
    }
}
