import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner	input = new Scanner(System.in);
		
		// Declare constants
	     final double BASE_SALARY = 1000.0;
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be compute
		
		 while(true) {
			 System.out.print("Enter gross sales for the salesperson (or -1 to end) : ");
			 sales = input.nextInt();
			 
			 if(sales == SENTINEL) {
					break; 
			 }
			 
			 //compute
			 salary = BASE_SALARY + (sales * COMMISSION_RATE);
			 
			 //display
			 System.out.printf("The saleperson's salary is : $%,.2f%n%n", salary);
			 
		 }//while end
		 System.out.println("bye");

		 input.close();
	}

}