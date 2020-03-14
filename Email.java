import java.util.*;

public class Email {

  public static void main(String[] args) {

    CharSequence email;

    Scanner mail = new Scanner(System.in);

    System.out.println("Enter your email address");
    email  = mail.nextCharSequence();

    if (email.contains("@")) {
      System.out.println("Its is a email address");
    }
    else {
      System.out.println("Not a email address");
    }

  }

}
