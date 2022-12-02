
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables
    private int year, miles;
    private String model;
    private double fuelTankLevel;

    /**
     * Constructor for objects of class Car
     * @param int year, String model, int miles, double fuelTankLevel
     */
    public Car(int year, int miles, String model, double fuelTankLevel)
    {
        this.year = year;
        this.miles = miles;
        this.model = model;
        this.fuelTankLevel = fuelTankLevel;
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMiles(){
        return miles;
    }
}
