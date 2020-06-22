
import java.util.Scanner;
public class MilesToLaps {
   public static double milesToLaps(double userMiles){
      return userMiles/0.25;
   }
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double userMiles;
      double laps;
      userMiles = scnr.nextDouble();
      laps = milesToLaps(userMiles);
      System.out.printf("%.2f",laps);
   }
}