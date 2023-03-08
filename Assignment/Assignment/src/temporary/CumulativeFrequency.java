package temporary;

import java.util.Scanner;

public class CumulativeFrequency {

    public static void main(String args[]) {

        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();

        int[] myArray = new int[sizeOfArray];
        int[] cumulativeSum = new int[sizeOfArray];
        int sumTemp = 0;

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter the element at position " + i + ": ");
            myArray[i] = sc.nextInt();
            sumTemp += myArray[i];
            cumulativeSum[i] = sumTemp;
        }

        System.out.println("Cumulative Sum");
        for (int j : cumulativeSum) {
            System.out.println(j);
        }


    }

}
