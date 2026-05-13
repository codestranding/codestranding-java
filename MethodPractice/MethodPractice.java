import java.util.Scanner;

public class MethodPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "CodeStranding";
        int age = 32;

        happyBday(name, age);

        System.out.println(square(3));
        System.out.println(cube(3));

        String fullName =
                getFullName("Code", "Stranding");

        System.out.println(fullName);

        System.out.print("What is your age: ");
        int ageOne = scanner.nextInt();

        if (ageCheck(ageOne)) {
            System.out.println("Get in the club");
        } else {
            System.out.println(
                    "You have to wait little baby");
        }

        scanner.close();
    }

    static void happyBday(String name, int age) {

        System.out.printf(
                "Happy birthday to %s!!!\n", name);

        System.out.printf(
                "Happy birthday dear %s\n", name);

        System.out.printf(
                "You are %d years old\n", age);
    }

    static double square(double num) {
        return num * num;
    }

    static double cube(double num) {
        return num * num * num;
    }

    static String getFullName(
            String first,
            String last) {

        return first + " " + last;
    }

    static Boolean ageCheck(int ageOne) {

        return ageOne >= 18;
    }
}