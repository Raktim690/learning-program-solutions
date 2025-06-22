import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years for forecast: ");
        int years = scanner.nextInt();

        ForecastCalculator calculator = new ForecastCalculator();
        calculator.calculateForecast(principal, rate, years);

        scanner.close();
    }
}
