import java.util.Scanner;
public class WeightConversion{
    public static void main (String[] args) {
        
        
        //declair variables     
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;      
        
        //welcom message
        System.out.println("Wiight conversion program");
        System.out.println("Option s1 convert lbs to kgs");
        System.out.println("Option 2 convert kgs to lbs");

        //prompt for user choice
        System.out.print("Choose a option: ");
        choice = scanner.nextInt();

        //opt1 convert lbs to kgs
        if (choice == 1) {
            System.out.print("enter the weight in LBS: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your new weight in Kgs is: %.2f", newWeight);
        }
            //opt2 convert kgs to lbs
            else if (choice == 2) {
                System.out.print("enter the weight in KGS: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("Your new weight in Lbs is: %.2f", newWeight);
            }

                //else print not a valid choice
                else{
                    System.out.println("NOT A VALID OPTION");
                }


            scanner.close();
    }

}