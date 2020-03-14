import java.util.*;
import java.time.LocalDate;
import java.text.*;

public class DateOfBirth {
  public static void main(String[] args) {

    String birthday;
    SimpleDateFormat birthday = new SimpleDateFormat("yyyy-MM-dd");
    Scanner date = new Scanner(System.in);

    System.out.println("Enter your date of birth in this format: YYYY-MM-DD ");
    birthday = date.nextLine();

    LocalDate today = LocalDate.now();


  }
}
