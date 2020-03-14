import java.util.*;
//class
public class Password {
  //main method
  public static void main(String[] args) {
    //Variables
  	String passwordS = "";
    String passwordSt = "";
    //Scanner
    Scanner password = new Scanner(System.in);
    //Ask the user for password
    System.out.println("\n\tEnter your password" );
  	passwordS = password.nextLine();
    //Ask the user for password again
  	System.out.println("\n\tPlease enter your password again" );
  	passwordSt = password.nextLine();
    //If both entered password are equal then it executes
    if(passwordS.equals(passwordSt)) {
    System.out.println("\n\t* ~ You are now registered as a new user ~ * ");
    }
    //It executes if first condition didn't meet
    else {
    System.out.println("\n\t* ~ Sorry, there is a typo in your password ~ * ");
    }

  }
}
