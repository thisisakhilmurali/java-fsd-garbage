package firstassessment;

public class Fibonacci {
    public static void main(String arg[]) {
        int count = 10;
        int first = 0;
        int second = 1;
        int third;

        System.out.print(first + " " + second);

        for (int i = 2; i < count; i++) {
            third = first + second;
            System.out.println(" " + third);
            first = second;
            second = third;
        }
    }
}
