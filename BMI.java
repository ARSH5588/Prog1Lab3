import java.util.*;

public class BMI {

  public static void main(String[] args) {

  double pounds, kilograms, feet, meters, bmi;
  final double MULTI_POUNDS = 0.45359237;
  final double MULTI_FEET = 0.3048;

  Scanner bmiNum = new Scanner(System.in);

  System.out.println("\n\t* ~ Enter your weight in pounds ~ *\n ");
  pounds = bmiNum.nextDouble();

  System.out.println("\n\t* ~ Enter your height in feet ~ *\n ");
  feet = bmiNum.nextDouble();

  kilograms = pounds * MULTI_POUNDS;
  meters = feet * MULTI_FEET;

  bmi = kilograms/Math.pow(meters, 2);

  if (bmi >= 12 && bmi <= 18) {
    System.out.printf("Underweight %.2f", bmi);
  }
  else if (bmi >= 19 && bmi <= 24) {
    System.out.printf("Normal = %.2f", bmi);
  }
  else if (bmi >= 25 && bmi <= 29) {
    System.out.printf("Overweight = %.2f", bmi);
  }
  else if (bmi >= 30 && bmi <= 39) {
    System.out.printf("Obese = %.2f", bmi);
  }
  else if (bmi < 0) {
    System.out.println("\n\tWarning, the calculated BMI turned out to \n\tbe negative which is INVALID ");
  }
  else {
    System.out.printf("Such a BMI doesn't exist = %.2f", bmi);
  }

  }

}
