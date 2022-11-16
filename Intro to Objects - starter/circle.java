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
        calcRadius();
        calcArea();
    }

    private double calcCircumference(){
        return 2*PI*radius;
    }
    
    /**
     * calcRadius sets the radius to the proper number
     * 
     */
    
    
    private void calcRadius(){ 
        //no local variable in this class 
        radius = diameter/2;
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