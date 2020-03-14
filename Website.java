import java.util.*;
  
public class Website {
  public static void main(String[] args) {
    //Variables
    String websiteAddress = "";
    //Scanner
    Scanner website = new Scanner(System.in);
    //Ask the user a website address
    System.out.println("\n\t* ~ Enter an URL link to be analyzed and checked to determine which category it is from ~ * ");
    websiteAddress = website.nextLine();
    //This executes if it contains "gov"
    if (websiteAddress.contains("gov")) {
    System.out.println("\n\tEntered website address belongs to the government ");
    }
    //This executes if it contains "edu"
    else if (websiteAddress.contains("edu")) {
    System.out.println("\n\tEntered website address belongs to a university ");
    }
    //This executes if it contains "com"
    else if (websiteAddress.contains("com")) {
    System.out.println("\n\tEntered website address belongs to a business ");
    }
    //This executes if it contains "org"
    else if (websiteAddress.contains("org")) {
    System.out.println("\n\tEntered website address belongs to an organization ");
    }
    //This executes if it contains none of the others work for the entered website
    else {
    System.out.println("\n\tEntered website address belongs to another entity ");
    }

  }
}
