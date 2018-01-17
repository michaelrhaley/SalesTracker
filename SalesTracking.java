import java.text.NumberFormat;
import java.util.Scanner;

/*
 Program name: SalesTracking.java
 Programmer's name: Michael Haley
 Program description: Receives input from the user for sales per month,
 uses methods to display different functions like total, average, high and low
 */
public class SalesTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// each element in the array is assigned to a month name
		String[] monthArray = new String[12];
		monthArray[0] = "JANUARY";
		monthArray[1] = "FEBRUARY";
		monthArray[2] = "MARCH";
		monthArray[3] = "APRIL";
		monthArray[4] = "MAY";
		monthArray[5] = "JUNE";
		monthArray[6] = "JULY";
		monthArray[7] = "AUGUST";
		monthArray[8] = "SEPTEMBER";
		monthArray[9] = "OCTOBER";
		monthArray[10] = "NOVEMBER";
		monthArray[11] = "DECEMBER";

		// this array stores the values entered by the user for sales per month
		double[] monthlySales = new double[12];
		
		
		// calling all methods using monthly sales array
		getSales(monthArray, monthlySales);
		computeTotalSales(monthlySales);
		computeAverageSales(monthlySales);
		computeHighestMonth(monthlySales);
		computeLowestMonth(monthlySales);
		displaySalesInfo(monthlySales);
		
		
		
		

	}//end main 55644.32
	
	// ask the user for the information for sales per month and store it in the monthlySales array
	public static void getSales(String[] monthArray, double[] monthlySales)
	{
		Scanner input = new Scanner(System.in);
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		for (int index = 0; index < monthlySales.length; index++)
		{
			System.out.print("Enter sales for month: ");
			monthlySales[index] = input.nextDouble();
		}
	
		for (int index = 0; index < monthlySales.length; index++)
		{
			System.out.println("The sales for the month of " + monthArray[index] + " are: " + currencyFormatter.format(monthlySales[index]));
		
		}
	}
	
	public static double computeTotalSales(double[] monthlySales)
	{
		double totalSales = 0;
		
		for (int index = 0; index < monthlySales.length; index++)
		{
			totalSales = totalSales + monthlySales[index]; 
		}
		return totalSales;
	}
	
	public static double computeAverageSales(double[] monthlySales)
	{
		double averageSales = 0;
		double totalSales = 0;
		
		for (int index = 0; index < monthlySales.length; index++)
		{
			totalSales = totalSales + monthlySales[index]; 
			averageSales = totalSales/12;
		}
		return averageSales;
	}
	
	public static double computeHighestMonth(double[] monthlySales)
	{
		double highestMonth = monthlySales[0];
		int highIndex = 0;
		
		for (int index = 0; index < monthlySales.length; index++)
		{
			if (monthlySales[index] > highestMonth)
			{
				highIndex = index;
				highestMonth = monthlySales[index];
			}
		}
		return highIndex;
	}
	
	public static double computeLowestMonth(double[] monthlySales)
	{
		double lowestMonth = monthlySales[0];
		int lowIndex = 0;
		
		for (int index = 0; index < monthlySales.length; index++)
		{
			if (monthlySales[index] < lowestMonth)
			{
				lowIndex = index;
				lowestMonth = monthlySales[index];
			}
		}
		return lowIndex;
	}
	
	public static void displaySalesInfo(double[] monthlySales)
	{
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		System.out.println("The total sales for the year: " + currencyFormatter.format(computeTotalSales(monthlySales)));
		System.out.println("The average sales per month: " + currencyFormatter.format(computeAverageSales(monthlySales)));
		System.out.println("The month with the highest sales: " + computeHighestMonth(monthlySales));
		System.out.println("The month with the lowest sales: " + computeLowestMonth(monthlySales));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//end class
