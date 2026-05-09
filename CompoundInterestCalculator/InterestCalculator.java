import java.util.Scanner;

public class InterestCalculator{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //compund intrest caalculater

        double principal;
        double rate;
        int timesCompunded;
        int years;
        double amount;

        System.out.print("Enter the princepal amount: ");
        principal = scanner.nextDouble() ;
        
        System.out.print("Enter the intrest rate(in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the numbers of times compounded per year: ");
        timesCompunded = scanner.nextInt() ;

        System.out.print("Enter the numbers of years: ");
        years = scanner.nextInt();

        amount = principal* Math.pow(1+rate/timesCompunded,timesCompunded*years);
        System.out.println("the ammount after "+ years + " years is: $" + amount);
        System.out.printf("the ammount after %d years is $%.2f", years, amount);








        scanner.close();
    }
}