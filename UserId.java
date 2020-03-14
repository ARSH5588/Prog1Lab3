import java.util.*;
//class
public class UserId {
  public static void main(String[] args) {
    //Variabls
    String user = "admin";
    String password = "open";
    //Scanner
    Scanner id = new Scanner(System.in);
    //Ask the user for his User name
    System.out.println("\n\t\t* ~ Enter your User name ~ * ");
    user = id.nextLine();
    //Ask the user for his Password
    System.out.println("\n\t\t* ~ Enter your Password ~ * ");
    password = id.nextLine();
    //It executes if both, user and password are correct
    if ((user.equals("admin")) && (password.equals("open"))) {
      System.out.println("Welcome ");
    }
    //It executes if user name is correct and password is wrong
    else if ((user.equals("admin")) && (!password.equals("open"))) {
      System.out.println("Wrong password ");
    }
    //It executes if user name is wrong and password is correct
    else if ((!user.equals("admin")) && (password.equals("open"))) {
      System.out.println("Wrong user ID ");
    }
    //It executes if both, user name and password are wrong
    else {
      System.out.println("Sorry, wrong ID and password ");
    }

  }
}
