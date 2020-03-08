import java.util.*;

public class Batter {

  public static void main(String[] args) {

  int hits, atBats;
  double average, eligible;

  Scanner bats = new Scanner(System.in);

  System.out.println("\n\t* ~ Enter the batter's number of hits ~ * ");
  hits = bats.nextInt();

  System.out.println("\n\t* ~ Enter the batter's number of at-bats ~ * ");
  atBats = bats.nextInt();

  Double hit = Double.valueOf(hits);
  Double atBat = Double.valueOf(atBats);
  average = hit / atBat;
  eligible = average;

  if (eligible >= 0.300) {
    System.out.println("\n\t\t~ Eligible for All Star Game ~ ");
  }
  else {
    System.out.println("\n\t\t~ Not Eligible ~");
  }

  }

}
