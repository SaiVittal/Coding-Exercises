public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        if(daysSkipped > 5){
            return 0.85;
        }
        return 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        if(productsSold<=20){
            return 10;
        }
        return 13;
    }

    public double bonusForProductSold(int productsSold) {
        return (double) productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
         double salary = (1000 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold));
        return salary > 2000 ? 2000 : salary;
    } 
}
