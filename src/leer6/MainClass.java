/*
 * CITP130 - Mobile Applications Development
 * Professor Sperling
 * Author - Randy Lee
 * Assignment 4 - Object Oriented Programming
 * 
 * Create a JAVA CircleAppProject in NetBeans where you create not only a main() 
 * function, but also a Circle and Cylinder Class. The application should compute 
 * the volume and surface area of a cylinder with a radius of 2.5 and a height 
 * of 5.0 using a Circle Object within the Cylinder Class to get the area and 
 * perimeter. You may hard-code the above values in the main(). In other words, 
 * you do not have to get values from the User. However, extra credit maybe 
 * awarded for doing so.
 */
package leer6;

import java.util.Scanner;

/**
 *
 * @author randylee
 */
public class MainClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double radius;
        double height;
        

        
        OUTER:
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("CITP130 - Object Oriented Programming, "
                    + "Assignment 04");
            try {
                System.out.print("Discover measurements of a (1-Circle, 2-Cylinder, 3 - Exit): ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        {
                            // get some user rinput for parameters for circle
                            System.out.print("Radius of Circle: ");
                            radius = sc.nextDouble();
                            Circle c1 = new Circle(radius);
                            System.out.println("The area of your circle is: " + c1.getArea());
                            System.out.println("The perimeter of your circle is: " + c1.getPerimeter());
                            break;
                        }
                    case 2:
                        {
                            // get some user input for parameters for cylinder
                            System.out.print("Radius of cylinder?: ");
                            radius = sc.nextDouble();
                            System.out.print("Height of cylinder?: ");
                            height = sc.nextDouble();
                            // cylinder class extends circle class
                            Cylinder c1 = new Cylinder(radius, height);
                            System.out.println("The volume of your circle is: " + c1.getVolume());
                            System.out.println("The surface area of your circle is: " + c1.getSurfaceArea());
                            break;
                        }
                    case 3:
                        break OUTER;
                    default:
                        break;
                }
            }catch (Exception e) {
                System.out.println("Try typing in a valid input.\n");
            }
        }
    }
    
}
