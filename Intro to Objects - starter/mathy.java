import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
//import javax.swing.*;

public class mathy
{
    private int area=0;

    /**
        default constructor - stubed in
    */
    public mathy( )
    {

        area =0;
        System.out.println ("hi from default constructor" );

    }//end of default const


    /**
     * constructor
     * @param int sets area
     */
    
    public mathy(int a){
        area = a; //local variables take precedence over class variables 
        System.out.println("hi from constructor");
    }

    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
        */
    public int abs (int x)
    {
       
        if (x<0)
            x = -x;
            
        return x;

    }//end of abs

    /**
        take the absoulute value of the number
        @param double value
        @return absoulute value of number
    */
    
    // overloading method - different type or different amount
    public static double abs(double x) 
                       //method signature
    {
        x = -5;
        if(x<0)
            x=-x;
        
        System.out.println(x+"double");
        return x;
    }
    
    /**
     * 
     */
    
    public double circleArea(int r){
        double area = Math.PI * Math.pow(r,2);
        return area;
    }

    /**
     * getArea
     * @return the area that has been calculated
     */

    public double getArea(){
        return area;
    }
    
    
    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */

    //public int add (int x, int y)
    //end of add


    //public double add (double x,double y)
    

    /**
            toString
            message from Mathy class
            @param none
            @return String message
    */


    public String toSing() //if this is not a toString, it will print the address number
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


}//end of class