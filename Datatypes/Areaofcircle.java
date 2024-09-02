import java.util.*;

public class Areaofcircle {
    public static void main(String args[]) {
        Scanner x = new Scanner (System.in);

        System.out.print("Enter the radius: ");
        float radius = x.nextFloat();

        float a = 3.14f;
        float Area = a * radius * radius;
        System.out.print("The area of circle is: ");
        System.out.print(Area);

    }
}