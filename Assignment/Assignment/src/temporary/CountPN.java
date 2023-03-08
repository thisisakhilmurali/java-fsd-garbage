package temporary;

public class CountPN {
    public static void main(String[] arg) {

        int[] myArray = {4, -4, 6, 8, -9, 0, 4, -7, 56};

        int countPositive = 0;
        int countNegative = 0;

        for(int element: myArray) {
            if(element < 0)
                countNegative += 1;
            else
                countPositive += 1;
        }

        System.out.println("Count of Negative Numbers: " + countNegative);
        System.out.println("Count of Positive Numbers: " + countPositive);
    }
}
