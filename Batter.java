//Import from Java
import java.util.*;

public class Batter {
  public static void main(String[] args) {
    //Variables
    int hits, atBats;
    double average, eligible;
    //Scanner used by import
    Scanner bats = new Scanner(System.in);
    //Ask the user for the amount of hits
    System.out.println("\n\t* ~ Enter the batter's number of hits ~ * ");
    hits = bats.nextInt();
    //Ask the user for the amount of at-Bats
    System.out.println("\n\t* ~ Enter the batter's number of at-bats ~ * ");
    atBats = bats.nextInt();
    //Conversion to double numbers
    Double hit = Double.valueOf(hits);
    Double atBat = Double.valueOf(atBats);
    //Formulas
    average = hit / atBat;
    eligible = average * 100;
    //Execution if the number is greather than or equal to 0.300
    if (eligible >= 0.300) {
      System.out.printf("\n\t\t~ Eligible for All Star Game: %.0f Percent ", eligible);
    }
    //Execution if the if statement return to be false
    else {
      System.out.printf("\n\t~ Not Eligible: %.0f Percent " , eligible);
    }

  }
}
