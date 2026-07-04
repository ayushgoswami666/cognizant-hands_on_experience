package Algorithum_data_structure.FinancialForecastExample;

public class FinancialForecastTest {


    public static void main(String[] args) {

        double amount = 100000;
        double[] growthRates = {0.05, 0.08, 0.11};
        int years = 3;

        double avgRate = FinancialForecast.AvgRate(growthRates);

        double recursive = FinancialForecast.futurevalue(amount, avgRate, years);
        double iterative = FinancialForecast.iterativevalue(amount, avgRate, years);
        double formula = FinancialForecast.formulavalue(amount, avgRate, years);

        System.out.println("Average Growth Rate: " + (avgRate * 100) + "%");
        System.out.println("Recursive Forecast: " + recursive);
        System.out.println("Iterative Forecast: " + iterative);
        System.out.println("Formula Forecast: " + formula);

        if (Math.abs(recursive - iterative) < 0.01 &&
            Math.abs(recursive - formula) < 0.01) {
            System.out.println("All methods give the same result.");
        } else {
            System.out.println("Results do not match.");
        }
    }
}
    

