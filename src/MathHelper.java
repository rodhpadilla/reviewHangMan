public class MathHelper {
    public static final double PI = 3.14159;
    private static int calculationCounter = 0;

    private MathHelper(){
    }

    public static double circleArea(double radius) {
        calculationCounter++;
        return PI * radius * radius;
    }

    public static double add(double num1, double num2) {
        calculationCounter++;
        return num1 + num2;
    }

    public static int getCalculationCounter(){
        return calculationCounter;
    }
}
