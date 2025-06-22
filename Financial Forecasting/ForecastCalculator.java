public class ForecastCalculator {

    public void calculateForecast(double principal, double rate, int years) {
        System.out.println("Year\tProjected Amount");
        for (int i = 1; i <= years; i++) {
            double amount = principal * Math.pow(1 + rate / 100, i);
            System.out.printf("%d\t%.2f%n", i, amount);
        }
    }
}
