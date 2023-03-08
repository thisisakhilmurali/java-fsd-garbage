package temporary;
public class MaxNumberInArray {
    public static void main(String[] arg) {

        int[] array = {5, 3, 8, 1, 7, 2};
        int maxNumber = array[0];

        for (int i = 1; i < array.length; i++)
            if(array[i] > maxNumber)
                maxNumber = array[i];

        System.out.println("Max Number: " + maxNumber);
    }
}
