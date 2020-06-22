import java.util.Scanner;

public class DrivingCostsMethod {
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollorsPerGallon){
      return drivenMiles*dollorsPerGallon/milesPerGallon;
   }

   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      double milesPerGallon, dollorsPerGallon;
      milesPerGallon = scanner.nextDouble();
      dollorsPerGallon = scanner.nextDouble();
      System.out.printf("%.2f %.2f %.2f\n", drivingCost(10,milesPerGallon,dollorsPerGallon), drivingCost(50,milesPerGallon,dollorsPerGallon), drivingCost(400,milesPerGallon,dollorsPerGallon));
   }
}