/********************************************************************
// These are the notes for ch 4 used in hayes class
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class ch4notes7_08
{

    //static int sum = 987654;

    public static void main (String[] args)
    {
    
        mathy solver = new mathy(7);
        int x = -5;
        
        double y = 5.5;
        System.out.println(solver.abs(-5)); //obj.method
        System.out.println(solver.abs(y)*10);
        System.out.println(solver.circleArea(10));
        System.out.println(solver.getArea());
        //System.out.println(abs(-8)*abs(9));
        //System.out.println(abs(5.2)+1);
        //System.out.println(abs(x));
        //System.out.println(x+"main");
        
    /**/
    }// end of main
    
    /*
    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    
   
    // public vs. private - public methods everyone can view/use
    //static = abstract!
    //return type int, double if return nothing void
    //abs - name of the function
    //(parameter) - info you must send to the function
    
    public static int abs (int x)
    { //x is a local variable, only seen in abs
        if (x < 0)
            x = -x;
    
        return x; //stops the function, returns back to where it began. 
    }//end of abs, x is no longer in memory by the end of the function
    
    /**
        take the absoulute value of the number
        @param double value
        @return absoulute value of number
    
    
   
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
     * add will sum the two ints and return the result 
     * @param int x int y
     * @return int sum 
     **/
    
    /*                        //method signature
    public static int add (int x, int y){
        int sum=x+y;
        return sum;
    }

    public static int add(int x, int y, int z){
        return x+y+z;
    }

    */
}// end of class









