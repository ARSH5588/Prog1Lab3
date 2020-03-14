import java.util.*;

public class ServiceConverter {
  public static void main(String[] args) {
    ////Variables
    int service;
    String a = "";
    //Scanner
    Scanner convert = new Scanner(System.in);
    //All the services
    System.out.println("Enter a digit between 1-5 to proceed " + "\nto the service you wish use" );
    System.out.println("1) Meters to Feet ");
    System.out.println("2) CAD to USD ");
    System.out.println("3) Celsius to Fahrenheit ");
    System.out.println("4) Centimeters to Kilometers ");
    System.out.println("5) USD to CAD\n ");
    service = convert.nextInt();

    switch (service) {
      //Find 1 in String a from the services offered
      case 1: a = "1";
      System.out.println("You picked meters to feet converter");
      System.out.println("Enter the amount of meters you wish to convert ");
      Double meters = convert.nextDouble();
      //Variables
      Double feet = meters * 3.2808399;

      System.out.printf("Feet = %.2f", feet);

      break;
      //Find 2 in String a from the services offered
      case 2: a = "2";
      System.out.println("You picked CAD to USD ");
      System.out.println("Enter the CAD amount you wish to convert ");
      double cad = convert.nextDouble();
      //Variables
      double usd;
      usd = cad*0.72;
      System.out.printf("USD = $%.2f", usd);

      break;
      //Find 3 in String a from the services offered
      case 3: a = "3";
      System.out.println("You picked Celsius to Fahrenheit ");
      System.out.println("Enter temperature in Celsius ");
      Double celsius = convert.nextDouble();
      //Variables
      final double FACTOR = 0.72;
      double fahrenheit = celsius * 0.72;

      System.out.printf("Fahrenheit = %.2f", fahrenheit);

      break;

      //Find 4 in String a from the services offered
      case 4: a = "4";
      //Variables
      double cm;
      double kilometers;
      final int factor = 100000;

      System.out.println("You picked Centimeters to Kilometers ");
      System.out.println("Enter the amount of centimeters you wish to convert");
      cm = convert.nextDouble();
      //Formula
      kilometers = cm * 100000;

      System.out.printf("Kilometers = %.2f", kilometers);

      break;
      //Find 5 in String a from the services offered
      case 5: a = "5";
      //Variables
      double usd2, cad2;
      final double factor2 = 1.38;

      System.out.println("You picked USD to CAD");
      System.out.println("Enter the USD amount you wish to convert ");
      usd2 = convert.nextDouble();
      //Formula
      cad2 = usd2 * 1.38;

      System.out.println("CAD = "+ cad2);

      break;

    }

  }
}
