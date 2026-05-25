//import java.util.Scanner;

public class Varg{	
	public static void main(String[] args) {
		// Scanner scnr = new Scanner(System.in);
		// vargs = allow a method to accept a varying # of arguments
		// makes methods mmore flexible , no need for overloaded methods
		// java will pack the arguments into an array
		//...(ellipsis)

		System.out.println(add(1, 2, 3, 4));
		System.out.println(average(1, 2, 3, 4));


		
	
 //scnr.close();
	}
	static  int add(int... numbers){

		int sum = 0;

		for(int number : numbers){
			sum+=number;
		}
		return sum;
	}

	static double average(double... avg){
		double sums = 0;
		for(double avgs : avg){
			sums+=avgs;
		}
		return sums/ avg.length;
	}






}