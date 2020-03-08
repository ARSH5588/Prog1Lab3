// Import Input
import java.util.*;
// Class
public class Season {
  // Main Method
  public static void main(String[] args) {
  // Variable
  int temperature;
  // Scanner Object created
  Scanner temp = new Scanner(System.in);
  // Scanner Object used
  System.out.println("\n\t~ Enter a temperature in a whole number ~ ");
  temperature = temp.nextInt();
  // Temperature between 90 and 110 is Summer
  if ((temperature >= 90) && (temperature <= 110)) {
    System.out.println("\n\t\t\t~ Summer ~ ");
  }
  // Temperature between 70 and 90 is Spring
  else if ((temperature >= 70) && (temperature < 90)) {
    System.out.println("\n\t\t\t~ Spring ~ ");
  }
  // Temperature between 50 and 70 is Fall
  else if ((temperature >= 50) && (temperature < 70)) {
    System.out.println("\n\t\t\t~ Fall ~ ");
  }
  // Temperature between 50 and -5 is Winter
  else if (temperature < 50 && (temperature >= -5)) {
    System.out.println("\n\t\t\t~ Winter ~ ");
  }
  // Temperature over 110 and under -5 is Invaild
  else if ((temperature > 110) || (temperature < -5)) {
    System.out.println("\n\tThe temperature entered is outside the valid range.");
  }
  // Main Method Ended
  }
// Class ended
}
