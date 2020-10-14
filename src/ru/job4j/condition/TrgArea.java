package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl2 = (p * (p - a) * (p - b) * (p - c));
        return Math.sqrt(rsl2);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(7, 10, 6);
        System.out.println("площадь треугольника " + rsl); }
}