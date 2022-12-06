/**
 * Adeline Tse, Lakyshaa Nathan
 * The Car Class
 * 
 */
import java.util.Random;
import java.text.*;
public class Car
{
    // instance variables
    private int year, miles;
    private String model;
    private double fuelTankLevel;
    
    Random random = new Random();
    DecimalFormat df = new DecimalFormat("0.##"); 
    
    //this is changed from 400 to 200 to make it easier for the gallons to change
    private int maxGasInTank = 400;
    /**
     * Constructor for objects of class Car
     * @param int year, String model, int miles, double fuelTankLevel
     */
    public Car(int year, String model, int miles, double fuelTankLevel)
    {
        // initialise instance variables
        this.year = year;
        this.model = model;
        this.miles = miles;
        this.fuelTankLevel = fuelTankLevel;
        
        
    }
    /**
     * Method to get year of the car
     * @return year
     */
    public int getYear()
    {
        return this.year;    
    }
    /**
     * Method to get model
     * @return model
     */
    public String getModel()
    {
        return this.model;    
    }
    /**
     * Method to get miles of the car
     * @return miles
     */
    public int getMiles()
    {
        return this.miles;    
    }
    /**
     * Method to get fuel tank level
     * @return fuelTankLevel
     */
    public double getFuelTankLevel()
    {
        return this.fuelTankLevel;    
    }
    
    /**
     * Method to get amount of miles driven
     * @param milesToAdd 
     */
    public void addMiles(int milesToAdd )
    {
        this.miles += milesToAdd;
    }
    
    /**
     * Method to get fuel tank level
     * @return fuelTankLevel
     */
    public boolean isFuelTankEmpty()
    {
        if (this.getMiles() == 0)
            return true;
        else 
            return false;
    }
    
    /**
     * Method to convert fuel tank level
     * @return fuelTankLevel
     */
    public double milesToFuelLevel(double miles)
    {
        return miles / this.maxGasInTank *100;
    }
    
    /**
     * Method to get fuel tank level in terms of miles
     * @return miles left in car
     */
    public double getFuelLevelInMiles()
    {
        return this.getFuelTankLevel() * maxGasInTank / 100;
    }
    
    /**
     * Method to modify fuel tank level. This subtracts the SubtractMiles from the fuel tank level
     * @return fuelTankLevel
     */
    public void modifyFuelTankLevel(double subtractMiles)
    {
        double subtractMilesPercent = milesToFuelLevel(subtractMiles);
        
        //If the fuel tank is not empty
        if (!this.isFuelTankEmpty())
        {            
            if ((this.getFuelTankLevel() - subtractMilesPercent) >= 0)
            //If there are miles to modify fuel tank level
                {this.fuelTankLevel -= subtractMilesPercent; 
                }
            }
    }
    
    /**
     * Method to drive
     * @returns how many miles the car drove unless it does not have enough fuel to drive those miles
     */
    public String drive(int miles)
    {
        double subtractMilesPercent = milesToFuelLevel(miles);
        
        int milesToDrive = miles;
        if (!this.isFuelTankEmpty() && (this.getFuelTankLevel() - subtractMilesPercent) >= 0)
        //If the tank is not empty and that if the car were to drive the generated miles
        {
            modifyFuelTankLevel(milesToDrive);
            this.miles += milesToDrive;
            return "The " + this.getYear() + " " + 
            this.getModel () + " drove " + miles + " miles for a milelage of " +
            this.getMiles() + " and a fuel tank level of " + df.format(this.getFuelTankLevel()) + "%"; 
            
        }
        else if ((this.getFuelLevelInMiles() - milesToDrive) <= 0)
        //if there are not enough miles 
        {
            return "The " + this.getYear() + " " + this.getModel () + "'s fuel tank does not have enough to drive " + milesToDrive;
        }
        else
        //fuel tank is empty
        {    
            return "The " + this.getYear() + " " + this.getModel () + "'s fuel tank is empty!" ;
        }
    }