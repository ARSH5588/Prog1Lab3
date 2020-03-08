import java.util.Scanner;

public class AreaOfCircle {

  public static void main(String[] args) {

    double radius, area;
    Scanner circle = new Scanner(System.in);

    System.out.println("\n\t* ~ Enter the radius of your circle to get ~ *\n\t\t* ~ the area of the circle ~ * \n");
    radius = circle.nextDouble();

    area = Math.PI * Math.pow(radius, 2);

    if (radius > 0) {
    System.out.printf("\n\t* ~ Area of circle is %.2f ~ * \n", area);
    }
    else if ((radius == 0) || (radius < 0)) {
    System.out.println("\n\t* ~ WARNING, such a RADIUS can't be used ~ * \n\t* ~ to calculate the area of circle ~ *\n");
    }

  }

}
