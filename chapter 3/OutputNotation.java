import java.util.Scanner;

public class OutputNotation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double height;
        int amountChanged;

        height = scnr.nextDouble();
        amountChanged = scnr.nextInt();

        /* Your code goes here */

        System.out.printf("%.6e%%\n", height);
        System.out.printf("%.6f%%\n", height);
        System.out.printf("%o%%\n", amountChanged);

        scnr.close();
    }
}