public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value ) {
        return value / 60;
    }
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        System.out.println(  "indicated rubles are " + euro + " euro.");
        System.out.println("indicated rubles are " + dollar + " dollars.");
    }
}