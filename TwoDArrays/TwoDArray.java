//import java.util.Scanner;

public class TwoDArray{	
	public static void main(String[] args) {
		// Scanner scnr = new Scanner(System.in);

		//2d array = an array where each element is an array
		//useful for storing a matrix

		// String[] fruits = {"oranges", "kiwi", "bananas"};
		// String[] veggies = {"carrots", "broccoli", "Potato"};
		// String[] meats = {"beef", "chicken", "pork"};

		// String[][] groceries = {{"oranges", "kiwi", "bananas"}, 
		// 						{"carrots", "broccoli", "Potato"}, 
		// 						{"beef", "chicken", "pork"}};

		// groceries[0][0] = "apple";
		// groceries[1][2] = "kale";
		// groceries[2][1] = "eggs";

		// for(String[] foods : groceries){
		// 	for(String food : foods){
		// 		System.out.print(food+" ");

		// 	}
		// 	System.out.println();
		// }

		char[][] telephone = {{'1','2','3'},
							{'4','5','6'},
							{'7','8','9'},
							{'*','0','#'}};
		for(char[] numPad : telephone){
			for(char num : numPad){
				System.out.print(num+" ");
			}
			System.out.println();
		}


	}
}