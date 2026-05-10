import java.util.Scanner;

public class MathCls{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
/* this is some of the math functions available in Java */

        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        //     Double result1;
        //     result1 = Math.pow(2,3);
        //     System.out.println(result1);

        //     int result2;
        //      result2 = Math.abs(-5);
        //     System.out.println(result2);

        //     Double result3;
        //      result3 = Math.sqrt(9);
        //     System.out.println(result3);

        //     Long result4;
        //     result4 = Math.round(3.14);
        //     System.out.println(result4);

        //     Double result5;
        //     result5 = Math.ceil(3.14);
        //     System.out.println(result5);

        //     Double result6;
        //     result6 = Math.floor(3.99);
        //     System.out.println(result6);

        //     int result7;
        //     result7 = Math.max(10, 20);
        //     System.out.println(result7);

        //      int result8;
        //     result8 = Math.min(10, 20);
        //     System.out.println(result8 );

        


/* this is how to use the math functions */ 
        // double  a;
        // double  b;
        // double  c;

        // System.out.print("What is A?: ");
        // a = scanner.nextDouble();

        // System.out.print("What is B?: ");
        // b = scanner.nextDouble();

        
        // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // System.out.println("The hypotenuse is: " + c + " in");


        /* finding the area/ circumference and volume of a circle*/ 

        double radius;
        System.out.print("What is the radius of your circle?: ");
        radius = scanner.nextDouble();

        double circumference;
        double area;
        double volume;;

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("With the Radius of: "+radius+ ".");
        System.out.println("Your Circumference is: " + circumference + " in.");
        System.out.println("Your Area is: " + area + " in^2");
        System.out.println("Your Volume is: " + volume + " in^3");
       



        scanner.close();
    }
}