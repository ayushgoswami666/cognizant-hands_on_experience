package Algorithum_data_structure.FinancialForecastExample;

public class FinancialForecast {

    private FinancialForecast() {
    }
// calculating the average growth rate from the array of given past rates to pridict the future value
    public static double AvgRate(double[] rates) {
        if (rates == null || rates.length == 0){
            // throwing an exception if the array is empty or null
            throw new IllegalArgumentException("Growth rates cannot be empty.");
        }

        double sum = 0;

        for (double rate : rates) {
            // validating that the growth rate must be greater than -100%
            if (rate <= -1){
                // throwing an exception if the growth rate is not valid
                throw new IllegalArgumentException("Growth rate must be greater than -100%.");
            }
            sum += rate;
        }
        // returning the average growth rate   
        return sum / rates.length;
    }

    public static double futurevalue(double amount, double avgrate, int years) {
        // validating the present input values
        // amount <0
        // avgrate <= -1
        // years <0
        validate(amount, avgrate, years);
// base case for the recursion, if years is 0, return the amount
        if (years == 0){
            return amount;
        }
// recursive case , calculating the amount recursivly 
        return futurevalue(
                amount * (1 + avgrate),
                avgrate,
                years - 1
        );
    }

    public static double iterativevalue(double amount, double avgrate, int years) {
        // validating the input values
        // amount <0
        // avgrate <= -1
        // years <0
        validate(amount, avgrate, years);

        while (years-- > 0) {
            amount *= (1 + avgrate);
        }

        return amount;
    }

    public static double formulavalue(double amount, double avgrate, int years) {
        // validating the input values
        // amount <0
        // avgrate <= -1
        // years <0
        validate(amount, avgrate, years);
        // formula = amount * (1 + avgrate)^years
        return amount * Math.pow(1 + avgrate, years);
    }

    private static void validate(double amount, double avgrate, int years) {
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (avgrate <= -1){
            throw new IllegalArgumentException("Average rate must be greater than -100%.");
        }
        if (years < 0){
            throw new IllegalArgumentException("Years cannot be negative.");
        }
    }
}
    

