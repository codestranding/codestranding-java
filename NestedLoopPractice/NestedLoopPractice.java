import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rows: ");
        int rows = scanner.nextInt();

        System.out.print("How many columns: ");
        int columns = scanner.nextInt();

        System.out.print("What symbol: ");
        char input = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(input + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}