//Import Scanner from Java
import java.util.Scanner;
//Class start
public class AreaOfCircle {
  //Main method start
  public static void main(String[] args) {
    //Variable
    double radius, area;
    //
    Scanner circle = new Scanner(System.in);

    System.out.println("\n\t* ~ Enter the radius of your circle to get ~ *\n\t\t* ~ the area of the circle ~ * \n");
    radius = circle.nextDouble();

    area = Math.PI * Math.pow(radius, 2);

    if (radius > 0) {
      System.out.printf("\n\t* ~ Area of circle is %.2f ~ * \n", area);
    }
    else {
      System.out.println("\n\t* ~ WARNING, such a RADIUS can't be used ~ * \n\t* ~ to calculate the area of circle ~ *\n");
    }

  }

}
