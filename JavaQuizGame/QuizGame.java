import java.util.Scanner;
//Java Quiz game
public class QuizGame{	
	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);


	

		//question array[]
		String[] questions = {	"What keyword is used to create a variable that cannot be changed?",
								"Which data type is used for true or false values?",
								"What does this print? System.out.println(5 + 3);",
								"What does an array store?",
								"What symbol is used to end most Java statements?"};
		//options array[][]
		String[][] ops = {	{"1. static", "2. final", "3. void","4. class"},
								{"1. int", "2. String", "3. boolean", "4. char"},
								{"1. 53", "2. 8", "3. 5 + 3", "4. Error"},
								{"1. Multiple values of the same type", "2. Only one value", "3. Only numbers", "4. Only words"},
								{"1. :", "2. .", "3. ,", "4. ;"}
							};
		
		//declare variables
		int[] answers = {2, 2, 3, 1, 4};
		int score = 0;
		int guess;
		
		//welcome message
		System.out.println("********************************");
		System.out.println("Welcome to the Java Quiz Game!!!");
		System.out.println("********************************");

		//question(loop)
		for(int i = 0; i < questions.length; i++){
			System.out.println(questions[i]);

			//list options
			for(String op : ops[i]){
				System.out.println(op);
			}

			//	get guess
			System.out.print("Enter you guess: ");
			guess = scnr.nextInt();
			
			//	check if user guess is right
			if (guess == answers[i]) {
				System.out.println("*******");
				System.out.println("Correct");
				System.out.println("*******");
				score++;
			}else{
				System.out.println("*******");
				System.out.println("Wrong!!");
				System.out.println("*******");
			}
		}
		//display final dcore
		System.out.println("Your final scor is: "+score+" out of "+questions.length);

		

		
		scnr.close();
	}
}