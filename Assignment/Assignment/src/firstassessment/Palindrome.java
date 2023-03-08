package firstassessment;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int copyOfNumber = number;
        int digit;
        int sum = 0;

        while(number > 0) {
            digit = number % 10;
            sum = (sum * 10) + digit;
            number /= 10;
        }

        if(copyOfNumber == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
