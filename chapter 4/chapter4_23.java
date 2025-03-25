import java.util.Scanner;

public class chapter4_23 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Please enter expected temperature, rain and humidity for Day 1:");
      double temp1=scnr.nextDouble();
      double rain1=scnr.nextDouble();
      double hum1 = scnr.nextDouble();
      System.out.println("Please enter expected temperature, rain and humidity for Day 2:");
      double temp2=scnr.nextDouble();
      double rain2=scnr.nextDouble();
      double hum2 = scnr.nextDouble();
      
      if(temp1<15){
         temp1=2;
         }
      else if(temp1>25){
         temp1=1;
         }
      else{
         temp1=3;
         }
      
      if(rain1>9){
         rain1=1;
         }
      else if(rain1>=4&&rain1<9){
         rain1=2;
         }
      else if(rain1 >=0&&rain1<4){
         rain1=3;
         }
      
      if(hum1>=0&&hum1<46){
         hum1=3;
         }
      else if(hum1>=46&&hum1<61){
         hum1=2;
         }
      else if(hum1>=61){
         hum1=1;
         }
      
      if(temp2<15){
         temp2=2;
         }
      else if(temp2>25){
         temp2=1;
         }
      else{
         temp2=3;
         }
      
      if(rain2>9){
         rain2=1;
         }
      else if((rain2>=4) && (rain2<9)){
         rain2=2;
         }
      else if((rain2 >=0)&&(rain2<4)){
         rain2=3;
         }
      
      if((hum2>=0)&&(hum2<46)){
         hum2=3;
         }
      else if((hum2>=46)&&(hum2<61)){
         hum2=2;
         }
      else if(hum2>=61){
         hum2=1;
         }
         
      
      double outcome1 = 3*temp1+2*rain1+hum1;
      double outcome2 = 3*temp2+2*rain2+hum2;
      
      
      
      System.out.println("\nOutcome score day 1: "+outcome1);
      System.out.println("Outcome score day 2: "+outcome2);
      
      if (outcome1>outcome2){
         System.out.println("The best day to hold your event is: Day 1");
         }
      else if (outcome1<outcome2){
         System.out.println("The best day to hold your event is: Day 2");
         }
      else if(outcome1==outcome2){
         System.out.println("The best day to hold your event is: Day 1 or Day 2");
         }
      
   }
}