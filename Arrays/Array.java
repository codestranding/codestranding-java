import java.util.Arrays;
import java.util.Scanner;

public class Array{	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//array = a colection of values of the same data type
		// * think of it as a variable that can sstore more than 1 value
// 		String[] fruits = {"apple", "orange", "banana", "coconut"};
		
// 		fruits[0] = "pineapple";
// 		int numOfFruits = fruits.length;

// 		System.out.println(numOfFruits+" iteams");

// 		for(int i = 0; i < fruits.length; i++){
// 			System.out.print(fruits[i]+", ");

// 		}
// 		System.out.println("");
// 		System.out.println("");
// 		//enhance for loop
// 		for(String fruit : fruits){
// 			System.out.println(fruit);
// 		}
// 		System.out.println("");
// 		//sort
// 		Arrays.sort(fruits);
// 		for(String fruit : fruits){
// 			System.out.println(fruit);
// 		}
// 		//fill
// 		System.out.println("");
// 		System.out.println("");
// 		Arrays.fill(fruits, "Lemons");
// 		for(String fruit : fruits){
// 			System.out.println(fruit);
// 		}
// //enter user input into array list
// 		String[] foods;
// 		int size;
// 		System.out.print("How many food iteams would you like: ");
// 		size = scnr.nextInt();
// 		scnr.nextLine();

// 		foods = new String[size];

// 		for(int i = 0; i < foods.length; i++){
// 			System.out.print("enter a food: ");
// 			foods[i] = scnr.nextLine();
// 		}
		

// 		System.out.println(foods.length);
// 		for(String food : foods){
// 			System.out.print(food+" ");
// 		}

	//how to search through a array
	int [] number = { 1, 8 , 6 , 3 , 2, 7};
	String[] fruitz = {"kiwi", "lime", "pomagrant", "cherry"};
	int target;
	String targetz;
	boolean isFound = false;

	System.out.println("what number are you looking for(0-9): ");
	target = scnr.nextInt();
	scnr.nextLine();
	System.out.println("what fruirt are you looking for: ");
	targetz = scnr.nextLine();

	for(int i = 0; i < number.length; i++){

		if (target == number[i]) {

			System.out.println(target+" is found at index: "+i);

			isFound = true;

			break;
		}
	}
	if (!isFound){
		System.out.println(target+" is not found in the array");
		
	}
	for(int i = 0; i < fruitz.length; i++){

		if (fruitz[i].equals(targetz)) {
			
			System.out.println(targetz+" is found at index: "+i);

			isFound = true;

			break;
		}
	}
	if (!isFound){
		System.out.println(targetz+" is not found in the array");
	}



		
	
 scnr.close();
	}
}