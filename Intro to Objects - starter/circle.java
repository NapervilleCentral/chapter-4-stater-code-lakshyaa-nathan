/*************************************************
Class circle

************************************************/

import java.awt.*;
//import java.applet.Applet;

public class circle
{
    // private data
    // int xCenter, yCenter, radius;
    
    public final double PI = 3.1415;
    private double diameter, circumference, radius, area; //cannot be seen outside of the class, you can indirectly access private through a public class


    /**
     * Default Constructor:
     * 
    */
    public circle ( )
    {
        radius= 0 ;
        diameter = 0;
        circumference = 0;
        area = 0;
    }

    /**
    //Constructor
    */
    public circle(double radius)//most methods shouold be public
    {
        radius = radius; //local variable, so holds precedence
        this.radius = radius; //this. is the attribute vs. the local variable (radius is 5 with this)
        circumference = calcCircumference();
        calcDiameter();
        calcArea();
    }

    
    /**
     * Copy Constructor copy all of the values for 1 circle to this circle
     * @param Circle 
     */
    
    
    
    private double calcCircumference(){
        return 2*PI*radius;
    }
    
    public circle(circle other){
        this.radius = other.radius ; //
        this.diameter = other.diameter;
        this.circumference = other.circumference;
        this.area = other.area;
    }
    
    /**
     * equals method 
     * @return true if radius is the same 
     */
                               //or object
    public boolean equals(circle other){
        return this.radius == other.radius; //will tell you if the values are equivalent 
    }
    
    
    /**
     * calcDiameter sets the diameter to the proper number
     * 
     */
    
    
    private void calcDiameter(){ 
        //no local variable in this class 
        diameter = radius * 2;
    }
    
    
    public double getDiameter(){
        
        return diameter;
    }
    
    /**
     * calcCircumfernce = private?? only the class need to use it
     * does the user?
     */
    
    
    
    /**
     * toString
     * @return String of the private data
     */
    
    public String toString(){
        String data = "Radius: "+radius;
        data += "Circumference "+circumference;
        data += "Diameter" +diameter;
        data += "Area: "+ area;
        return data;
    }
    
    /**
     * calcArea = private, finds the area of the circle
     */
    
    private void calcArea(){
        double area = PI*Math.pow(radius,2);
    }
    
}//end of class