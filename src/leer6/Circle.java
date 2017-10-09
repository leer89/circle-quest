/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer6;

/**
 *
 * @author randylee
 */
public class Circle {
  
    private double radius;
    
    // default constructor
    public Circle ()
    {
        
    }
    
    // constructor with one argument, radius
    public Circle (double radius)
    {
        this.radius = radius;
    }
    
    // constructor with two arguments since assignment calls for cylinder to extend circle
    public Circle (double radius, double height)
    {

    }
    
    public double getArea()
    {
        double area;
        
        area = Math.PI * Math.pow(radius, 2) ;
        
        return area;
    }
    
    public double getPerimeter()
    {
        double perimeter;
        
        perimeter = 2 * ( Math.PI * radius);
        
        return perimeter;
    }
}
