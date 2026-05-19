import java.util.Random;
import java.util.Scanner;

public class DiceRoll{
	
	public static void main(String[] args) {
		
		//java dice roller program

		//declare variables
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		int numOfDice;
		int total = 0;


		//get the # of dice from user
		System.out.print("enter the number of dice to roll: ");
		numOfDice = scnr.nextInt();

		//check if number of dice is > 0
		if (numOfDice > 0) {
			//roll all the dice
			for(int i  = 0; i < numOfDice; i++){
				int roll = rand.nextInt(1, 7);
				printDie(roll);
				System.out.println("you rolled: "+roll);
				total += roll;
			}
			//get the total
			System.out.println("Your total is: "+total);
			
			
		}else{
			System.out.println("number of dice must be greater than 0");
		}			
	
		scnr.close();
	}
	//display ascii of dice
	static void printDie(int roll){
		String dice1 = """
				 -------
				|       |
				|   *   |
				|       |
				 -------
				""";
		String dice2 = """
				 -------
				| *     |
				|       |
				|     * |
				 -------
				""";
		String dice3 = """
				 -------
				| *     |
				|   *   |
				|     * |
				 -------
				""";
		String dice4 = """
				 -------
				| *   * |
				|       |
				| *   * |
				 -------
				""";
		String dice5 = """
				 -------
				| *   * |
				|   *   |
				| *   * |
				 -------
				""";
		String dice6 = """
				 -------
				| *   * |
				| *   * |
				| *   * |
				 -------
				""";
		switch (roll) {
			case 1:
				System.out.println(dice1);
				break;
			case 2:
				System.out.println(dice2);
				break;
			case 3:
				System.out.println(dice3);
				break;
			case 4:
				System.out.println(dice4);
				break;
			case 5:
				System.out.println(dice5);
				break;
			case 6:
				System.out.println(dice6);
				break;
		
			default:
				System.out.println("Invalid roll");
				break;
		}
	}









}