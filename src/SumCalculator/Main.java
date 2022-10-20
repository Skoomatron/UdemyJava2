package SumCalculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        calc.setFirstNumber(2);
        calc.setSecondNumber(2);

        System.out.println(calc.getMultiplicationResult());
    }
}
