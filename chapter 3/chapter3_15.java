import java.util.Scanner;

public class chapter3_15 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        long phoneNumber;
        long tempNumber;
        long lastFour;
        long firstFour;
        long prefixNumber;

        System.out.println("Please enter the landline phone number:");
        phoneNumber = scnr.nextLong();

        tempNumber = phoneNumber;

        lastFour = tempNumber % 10000;
        tempNumber = tempNumber / 10000;

        firstFour = tempNumber % 10000;
        tempNumber = tempNumber / 10000;

        prefixNumber = tempNumber % 1000;
        tempNumber = tempNumber / 1000;

        System.out.println("Please enter the mobile phone number:");
        phoneNumber = scnr.nextLong();
        System.out.println("\nYour landline number is: +" + prefixNumber + " " + firstFour + " " + lastFour);
        tempNumber = phoneNumber;

        lastFour = tempNumber % 1000;
        tempNumber = tempNumber / 1000;

        firstFour = tempNumber % 1000;
        tempNumber = tempNumber / 1000;

        prefixNumber = tempNumber % 10000;
        tempNumber = tempNumber / 10000;

        System.out.println("Your mobile number is: 0" + prefixNumber + " " + firstFour + " " + lastFour);

        scnr.close();
    }
}

/*
 * Example Input:
 * 61296389386
 * 0416215237
 * 
 * Example Output:
 * Please enter the landline phone number:
 * Please enter the mobile phone number:
 * Your landline number is: +612 9638 9386
 * Your mobile number is: 0416 215 237
 */