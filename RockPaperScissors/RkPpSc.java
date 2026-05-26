import java.util.Random;
import java.util.Scanner;
//Java Quiz game
public class RkPpSc{	
	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);
		 Random random = new Random();

		//rock paper scissors game

		//declare
		String[] choices = {"rock", "paper", "scissors"};
		String playerChoice;
		String pcChoice;
		String playAgain = "yes";

		do{
			//get choice
		System.out.print("enter your move(rock, paper, or scissors): ");
		playerChoice = scnr.nextLine().toLowerCase();

		if(!playerChoice.equals("rock") && 
			!playerChoice.equals("paper") && 
			 !playerChoice.equals("scissors")){
			System.out.println("not a valid option");
			continue;
		};

		//get random choice for computer
		pcChoice = choices[random.nextInt(3)];
		System.out.println("Pc choice: "+pcChoice);

		//check win conditions
		if(playerChoice.equals(pcChoice)){
			System.out.println("its a tie");

		}else if ((playerChoice.equals("rock") && pcChoice.equals("scissors")) || 
					(playerChoice.equals("paper") && pcChoice.equals("rock")) || 
						(playerChoice.equals("scissors") && pcChoice.equals("paper"))) {
			System.out.println("you win");
		}else{
			System.out.println("you lose");
		}
		//ask to play again 
		System.out.print("play again(yes/no");
		playAgain = scnr.nextLine().toLowerCase();
		}while (playAgain.equals("yes"));
		
		//goodbye messages
		System.out.println("Thanks for playing");
	

	
	scnr.close();
	}
}