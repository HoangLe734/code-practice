import java.util.Scanner;

public class chapter3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of people:");
        int numPeople = sc.nextInt();
        System.out.println("Number of meals per person:");
        int numMeals = sc.nextInt();
        System.out.println("Cost per bag of rice:");
        double numCost = sc.nextDouble();

        int numCups = numPeople * numMeals;
        int numBags = (int) Math.ceil((double) numCups / 12.0);
        double price = numBags * numCost;

        System.out.printf("%nThis order will support %d people to each make %d rice based meals.%n", numPeople,
                numMeals);
        System.out.printf("Total meals: %d%n", numCups);
        System.out.printf("You will need %d bags of rice for a cost of $%5.2f.%n", numBags, price);

        System.out.printf("%nPlease input the expected percentage of late orders:%n");
        double lateOrder = sc.nextDouble();
        numBags = (int) Math.ceil((double) (numCups * (1 + lateOrder) / 12.0));
        price = numBags * numCost;
        System.out.printf("%nAllowing for late orders, you should order: %d bags of rice for a cost of $%.2f.", numBags,
                price);

        sc.close();
    }
}

/*
 * Example Input:
 * 10
 * 3
 * 10.5
 * 0.5
 * 
 * Example Output:
 * Number of people:
 * Number of meals per person:
 * Cost per bag of rice:
 * 
 * This order will support 10 people to each make 3 rice based meals.
 * Total meals: 30
 * You will need 3 bags of rice for a cost of $31.50.
 * 
 * Please input the expected percentage of late orders:
 * 
 * Allowing for late orders, you should order: 4 bags of rice for a cost of
 * $42.00.
 */