
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt the user for a number in a loop
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // if the number given is equal to 0, exit the loop
            if (number == 0) {
                break;

            // if the number given is negative, continue the loop
            } else if (number < 0) {
                System.out.println("Unsuitable number");
                continue;

            // if the number given is positive, print the number to the power of two
            } else {
                System.out.println(number * number);
            }
        }
    }
}
