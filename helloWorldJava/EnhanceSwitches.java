import java.util.Scanner;

public class EnhanceSwitches{
    public static void main (String[] args) {
//enhanced swich = a replacement to many else if statements
       Scanner scanner =new Scanner(System.in);
       /*  String day;

        System.out.print("What day is it today?: ");
        day = scanner.next().toLowerCase();

        switch(day){
            case "monday","tuesday", "wednesday", "thursday", "friday"  -> System.out.println("It is a weekday");
            case "saturday", "sunday" -> System.out.println("It is a weekend");
            default -> System.out.println("This is not a day ");
            }
            */
//enhanced swich calculator
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("What is your first number?: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter a operator(+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("What is your second number?: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!!!");
                    validOperator = false;
                }else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("NOT a Operator");
                validOperator = false;
            }
        }
        if (validOperator) {
            System.out.println(result);
        }






        scanner.close();
        
    }
}