import java.util.Scanner;
public class MadLib{
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

    System.out.println("Enter an adjective (description: happy, sad, etc.): ");
    adjective1 = scanner.nextLine();
     System.out.println("Enter a noun(person, place, or thing): ");
     noun1 = scanner.nextLine();
      System.out.println("Enter an adjective (description: happy, sad, etc.): ");
      adjective2 = scanner.nextLine();
       System.out.println("Enter a verb ending with -ing(action): ");
       verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description: happy, sad, etc.): ");
        adjective3 = scanner.nextLine();

        System.out.println("To dsy i went to a  " + adjective1 + " zoo.");
         System.out.println("In an exhibit, I saw a " + noun1+ ".");
          System.out.println(noun1 +" was "+ adjective2 + " and " + verb1 + "!");
           System.out.println("I was "+ adjective3 +"!");
        






        
scanner.close();
    }
}