import java.util.Scanner;

public class BankingProgram{
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		// java BankingProgram for beginners

		// declare variables
		double balance = 0;
		boolean isRunning = true;
		int choice;

		while (isRunning) {

			//display menue
			System.out.println("*****************************");
			System.out.println("CODESTRANDING BANKING PROGRAM");
			System.out.println("*****************************");
			System.out.println("1. Show Balance ");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("*****************************");

			//get and proccess users choice
			System.out.print("Enter your choice (1-4): ");
			choice = scnr.nextInt();

			switch(choice){

				case 1 -> showBalance(balance);
				case 2 -> balance += deposit();
				case 3 -> balance -= withdraw(balance);
				case 4 -> isRunning = false;
				default -> System.out.println("INVALID CHOICE");
			}
		}
		System.out.println("Thank you, see ya later");


		scnr.close();
	}
		
	//method showBalance()
	static void showBalance(double balance){
		System.out.println("*****************************");
		System.out.printf("$%.2f\n", balance);
	} 
	//method deposit()
	static double deposit(){

		double amount;

		System.out.print("Enter a amount to be deposit: ");
		amount = scnr.nextDouble();

		if (amount < 0) {
			System.out.println("amount CANT be negative");
			return 0;
		}
			return amount;
	
	}

	// method withdraw()
	static double withdraw(double balance){

		double amount; //local

		System.out.print("Enter a amount to be withdrawn: ");
		amount = scnr.nextDouble();

		if (amount > balance) {
			System.out.println("amount CANT exceed current amount");
			return 0;
		}else if (amount < 0) {
			System.out.println("amount CANT be negative");
			return 0;
		}
			return amount;
	
	}

	//exit message
		
	
}