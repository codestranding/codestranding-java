import java.util.Random;
import java.util.Scanner;

public class NumberGuessing{
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNum = random.nextInt(min, max+1);

        System.out.println("Number guessing game");
        System.out.printf("Guess a number %d - %d\n", min, max);
        

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNum) {
                System.out.println("the guess is to low");
                
            }else if (guess >randomNum) {
                System.out.println("the guess is to high");
            }else{
                System.out.println("you won!!!!");
                System.out.println("numbers of attemps: " + attempts);
            }
        }while(guess != randomNum);
        
        



        scanner.close();
    }
}
