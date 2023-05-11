import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Three-digit number: ");
        int number = input.nextInt();

        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;

        int reversedNumber = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println("The reversed number is: " + reversedNumber);
    }
}
