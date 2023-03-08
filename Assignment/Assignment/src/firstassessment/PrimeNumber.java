package firstassessment;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int numberToCheck = sc.nextInt();
        boolean flagVariable = false;

        for (int i = 2; i < numberToCheck/2; i++) {
            if(numberToCheck % i == 0) {
                flagVariable = true;
                break;
            }
        }

        if(flagVariable)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");

    }
}
