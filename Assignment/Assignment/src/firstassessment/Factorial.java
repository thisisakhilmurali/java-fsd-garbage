package firstassessment;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int productFactor = 1;

        for (int i = 1; i <= number; i+=1)
            productFactor *= i;

        System.out.print("Factorial Value: " + productFactor);


    }
}
