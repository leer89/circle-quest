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
public class Cylinder extends Circle {
    
    // final stops value change further
    private final double radius;
    private final double height;
    private double volume;
    private double surfaceArea;
    
    public Cylinder(double radius, double height) {
        super(radius, height);
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea ()
    {
        surfaceArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
        return surfaceArea;
    }
    
    public double getVolume ()
    {
        volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
}
