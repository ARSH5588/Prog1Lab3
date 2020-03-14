//Import Scanner from Java
import java.util.*;
//Class start
public class Celsius {
  //Main method start
  public static void main(String[] args) {
    //Variables
    double celsius;
    String answer = "";
    //Scanner used
    Scanner temp = new Scanner(System.in);
    //Ask to enter a temperature in Celsius
    System.out.println("Enter temperature in Celsius");
    //User input stored into celsius
    celsius = temp.nextDouble();
    //Conditional operator (?:)
    answer = (celsius >= 0) ? "Warm" : "Cold";
    //Answer being displayed
    System.out.println("Temperature in Celsius is " + answer);
  //Main method end
  }
//Class ended
}
