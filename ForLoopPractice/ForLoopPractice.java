import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Where would you like to start your countdown from: ");

        int start = scanner.nextInt();

        for (int i = start; i > -1; i--) {
            System.out.println(i);
        }

        System.out.println("Happy New Year!!!");

        scanner.close();
    }
}