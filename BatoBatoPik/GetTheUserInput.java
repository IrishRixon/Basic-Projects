import java.util.Scanner;
import java.util.InputMismatchException;

public class GetTheUserInput {
    public int getTheUserInput(String[] picks) {
        Scanner scan = new Scanner(System.in);
        int user = 0;

        System.out.println();

        for (int i = 0; i < picks.length; i++) {
            System.out.println(i + 1 + ". " + picks[i]);
        }

        while (true) {

            try {
                // get the user input
                System.out.print("\nYour choice: ");
                user = scan.nextInt();
                // if the input is invalid
                if (user < 1 || user > 4) {
                    throw new ArrayIndexOutOfBoundsException();

                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Please Input an Integer");
                scan.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input, Please enter 1-3");
                scan.nextLine();
            }
        }

        return user - 1;

    }
}