import java.util.Scanner;

public class chapter3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your first decimal value:");
        double firstNumber = sc.nextDouble();

        double firstSqrt = Math.sqrt(firstNumber);

        // STORE the integer representation of the square root
        int firstInt = (int) firstSqrt;

        boolean firstPS = ((firstSqrt - firstInt) == 0.0);
        String firstOutput = String.format("%-10.2f%-30d%-20b%n", firstNumber, firstInt, firstPS);

        // Repeat the above for the other 2 numbers

        System.out.println("Please input your second decimal value:");
        double secondNumber = sc.nextDouble();

        double secondSqrt = Math.sqrt(secondNumber);

        // STORE the integer representation of the square root
        int secondInt = (int) secondSqrt;

        boolean secondPS = ((secondSqrt - secondInt) == 0.0);
        String secondOutput = String.format("%-10.2f%-30d%-20b%n", secondNumber, secondInt, secondPS);

        System.out.println("Please input your third decimal value:");
        double thirdNumber = sc.nextDouble();

        double thirdSqrt = Math.sqrt(thirdNumber);

        // STORE the integer representation of the square root
        int thirdInt = (int) thirdSqrt;

        boolean thirdPS = ((thirdSqrt - thirdInt) == 0.0);
        String thirdOutput = String.format("%-10.2f%-30d%-20b%n", thirdNumber, thirdInt, thirdPS);

        // Output for the headings
        System.out.printf("%n%-10s%-30s%-20s%n", "Input", "Square Root as Integer", "Perfect Square");
        // System.out.printf("%-10.2f%-30d%-20b%n", );

        System.out.printf(firstOutput);// first number
        System.out.printf(secondOutput);
        System.out.printf(thirdOutput);

        sc.close();
    }
}

/*
 * Sample program run
 * Please input your first decimal value:
 * 16
 * Please input your second decimal value:
 * 16.49
 * Please input your third decimal value:
 * 16.51
 * 
 * Result:
 * Input Square Root as Integer Perfect Square
 * 16.00 4 true
 * 16.49 4 false
 * 16.51 4 false
 */