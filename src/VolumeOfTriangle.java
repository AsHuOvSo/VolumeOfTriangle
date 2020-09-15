//Import scanner and math library
import java.util.Scanner;
import java.lang.Math;

public class VolumeOfTriangle {
    //Start of main code
    public static void main(String[] args) {
        //write starting line
        System.out.println("Enter length of the Equilateral triangle:");
        //Scan for input
        Scanner lengthInput = new Scanner(System.in);
        //Convert input to datatype double
        double length = lengthInput.nextDouble();
        //Math
        double area = (Math.sqrt(3.0)/4.0) * Math.pow(length, 2.0);
        double volume = area * length;
        //Print end line
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
