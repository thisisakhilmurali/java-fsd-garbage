package temporary;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int number = sc.nextInt();
        int digits = 0, sum = 0;
        int temp = number;
        int finalDigit;

        while (temp > 0) {
            temp /= 10;
            digits += 1;
        }

        temp = number;

        while (temp > 0) {
            finalDigit = temp % 10;
            sum += Math.pow(finalDigit, digits);
            temp /= 10;
        }

        if(sum == number)
            System.out.println("Its Armstrong");
        else
            System.out.println("Its Not Armstrong");
    }
}
