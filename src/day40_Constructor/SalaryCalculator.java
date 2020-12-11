package day40_Constructor;

public class SalaryCalculator {
    public static int numberOfWorkingDays, numberOfWeeks;
    public double weeklyHours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static{
        numberOfWorkingDays = 5;
        numberOfWeeks = 52;
    }

    public SalaryCalculator(double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = weeklyHours * hourlyRate * numberOfWeeks;
        totalTax = (stateTaxRate + federalTaxRate) * salary;
        salaryAfterTax = salary - totalTax;

    }





}
