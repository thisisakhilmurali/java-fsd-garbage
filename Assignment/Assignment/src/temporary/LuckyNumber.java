package temporary;

import java.util.Scanner;
public class LuckyNumber {
    public static void main(String arg[]) {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int unkNumber = sc.nextInt();

        int digit;
        boolean digit3Present = false, digit6Present = false, digit9Present = false;

        while (unkNumber > 0) {

            digit = unkNumber%10;

            if(digit == 3)
                digit3Present = true;
            if(digit == 6)
                digit6Present = true;
            if(digit == 9)
                digit9Present = true;

            unkNumber /= 10;
        }

        if(digit3Present && digit6Present && digit9Present)
            System.out.println("Lucky Number");
        else
            System.out.println("Unlucky Number");

    }
}
