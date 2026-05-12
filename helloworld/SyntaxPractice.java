import java.util.Scanner;
public class SyntaxPractice{
    public static void main (String[] args) {
            
        Scanner scanner = new Scanner(System.in);
            
            /*System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age:");
            int age = scanner.nextInt();
            
            System.out.print("What is your GPA: ");
            double gpa = scanner.nextDouble();

            System.out.print("Are you a student? (true/false): ");
            Boolean isStudent = scanner.nextBoolean();


            
            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");
            System.out.println("Your GPA is " + gpa);
            System.out.println("Student: "+ isStudent);

            if(isStudent){
                System.out.println("You are enrolled as a student.");
            } else {
                System.out.println("You are not a student.");

            }
            */

            /*nested if statments

            boolean isStudent = false;
            boolean isSenior = false;
            double price = 9.99;

            if(isStudent){
                if (isSenior) {
                    System.out.println("you get a Senior discount of 20%");
                    System.out.println("you get a Student discount of 10%");
                    price*= 0.7;
                }else{
                    System.out.println("you get a Student discount of 10%");
                    price*= 0.9;
                }
                
            }else{
                if (isSenior) {
                    System.out.println("you get a Senior discount of 20%");
                    price*= 0.8;
                }else{
                    price*=1;
                }
            }

            System.out.printf("the price of the ticket is $%.2f ", price);
        */
         /*   // printf() = is a method used to format output
       // %[flag][width][.prcision][specifier-character]
            
        
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s \n", name);
        System.out.printf("Your name strats with %c \n", firstLetter);
        System.out.printf("You are  %d years old \n", age);
        System.out.printf("You are %f inches tall \n", height);
        System.out.printf("Employed? %b \n", isEmployed);
        System.out.printf("%s is %d years old \n", name, age);

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%(.2f \n", price1);
        System.out.printf("%(.2f \n", price2);
        System.out.printf("%(.2f \n", price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
*/ 


           /* String name = "CodeStranding";
             if (name .isEmpty()) {
                System.out.println("Your name is empty");
            }else{
                System.out.println("Hello " + name);
            }
            if (name.contains(" ")) {
                System.out.println("Your name has spaces");
            }else{
                System.out.println("your name doesnt contains spaces ");
            }

            int length = name.length();
            char letter = name.charAt(0);
            int index = name.indexOf("o");
            int lastIndex = name.lastIndexOf("a");
            name = name.toUpperCase();
            System.out.println(name);
            name = name.toLowerCase();
            System.out.println(name);
            name = name.trim();
            name = name.replace("o", "0");

            System.out.println(length);
            System.out.println(letter);
            System.out.println(index);
            System.out.println(lastIndex);
            System.out.println(name);
            
           if (name.equalsIgnoreCase("password")) {
            System.out.println("cannot be passowrd");
           }else{
            System.out.println("hello "+name);
           }
            */
            
            /* .substring() = a method used to extract a portion of a string
            string.substrung(start, end) 

            

            System.out.print("what is your Email: ");
            String email = scanner.nextLine();

            if (email.contains("@")) {
                String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);
            System.out.println(username);
            System.out.println(domain);
            }else{
                System.out.println("your email needs the @");
            }
            */
        /* //ternary operator ? = Returnt1 of 2 values if coditions true 
            // variable = (condition) ? ifTrue : ifFalse;
        
            int score = 70;

            if (score >= 60) {
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }

             
           String passOrFail = (score >= 60)? "pass" : "fail";
           System.out.println("YOU: " + passOrFail);
        
           int number = 4;
            String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
            System.out.println("your number is: " + evenOrOdd);
        
        int hours = 0;
        String timeOfDay = (hours < 12) ? "AM": "PM";
        System.out.println("the time of day is: " + timeOfDay);
       
        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println("Your tax rate is: " + taxRate);
         */


        /*
        && = ANd
        || = or
        ! = not 

        boolean isSunny = false;
        double temp = 60;//celcius 
        if (temp <= 80 && temp >= 70 && isSunny) {
            System.out.println("the weather is good");
            System.out.println("the weather is B E A utiful");
        }else if (temp <= 80 && temp >= 70 && !isSunny) {
             System.out.println("the weather is good");
             System.out.println("and cloudy");
        }else if (temp >= 30 || temp <= 60 && !isSunny) {
             System.out.println("the weather is cold");
             System.out.println("and cloudy");
        }


        //username must be 4-12 char
        //username must not have spaces or underscores

        String userName;

        System.out.print("Enter your new username: ");
        userName = scanner.nextLine();

        if (userName.length() < 4 || userName.length() > 12) {
            System.out.print("New username must be 4-12 characters");
        }else if (userName.contains(" ") || userName.contains("_")) {
            System.out.print("New username must not contain spaces or underscores");
        }else{
            System.out.println("Wlcome "+userName);
        }
        */

        /*while loop = repeat some code forever
        while some conditions are true
         
        String name = "";
        while (name.isEmpty()){
            System.out.print("enter you name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+ name);
       
        String game = "";
        while (!game.equals("Q")){
            System.out.println("youre in the matrix");
            System.out.print("enter Q to quit: ");
            game = scanner.nextLine().toUpperCase();
        }
        System.out.println("you have quit the game ");
    

        int age = 0;
        System.out.println("enter your age: ");
        age = scanner.nextInt();

        while (age < 0 ){
            System.out.println("you cannot have a negative age");
            System.out.println("enter your age: ");
            age = scanner.nextInt();
        }
            System.out.println("you are "+age+ " years old");
         
         int num = 0;
         do{
            System.out.print("enter a number between 1-10: ");
            num = scanner.nextInt();
        }while (num < 1 || num > 10 );
            System.out.println("your number is "+num);
        
        0    */

     
     
     
     
        scanner.close();
    }
}