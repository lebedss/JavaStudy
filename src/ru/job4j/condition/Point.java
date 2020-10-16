package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslA = x2 - x1;
        double rslC = Math.pow(rslA, 2);
        double rslB = y2 - y1;
        double rslD = Math.pow(rslB, 2);
        return Math.sqrt(rslC + rslD);
    }

    public static void main(String[]args) {
            double result = Point.distance(8, 2, 3, 0);
            System.out.println("distance between points is  " + result); }
    }


