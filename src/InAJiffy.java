import java.util.Scanner;

public class InAJiffy {
   public static double secondsToJiffies(double userSeconds){
      return userSeconds*100;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int jif = scnr.nextInt();
      System.out.printf("%.2f",secondsToJiffies(jif));

   }
}