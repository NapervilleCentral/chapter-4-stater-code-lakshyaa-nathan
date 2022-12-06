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
        return year;    
    }

    /**
     * Method to get model
     * @return model
     */
    public String getModel()
    {
        return model;    
    }

    /**
     * Method to get miles of the car
     * @return miles
     */
    public int getMiles()
    {
        return miles;    
    }

    /**
     * Method to get fuel tank level
     * @return fuelTankLevel
     */
    public double getFuelTankLevel()
    {
        return fuelTankLevel;    
    }

    /**
     * Method to get amount of miles driven
     * @param milesToAdd 
     */
    public void addMiles(int milesToAdd )
    {
        miles += milesToAdd;
    }

    /**
     * Method to get fuel tank level
     * @return fuelTankLevel
     */
    public boolean isFuelTankEmpty()
    {
        if (getMiles() == 0)
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
        return miles / maxGasInTank *100;
    }

    /**
     * Method to get fuel tank level in terms of miles
     * @return miles left in car
     */
    public double getFuelLevelInMiles()
    {
        return getFuelTankLevel() * maxGasInTank / 100;
    }

    /**
     * Method to modify fuel tank level. This subtracts the SubtractMiles from the fuel tank level
     * @return fuelTankLevel
     */
    public void modifyFuelTankLevel(double subtractMiles)
    {
        double subtractMilesPercent = milesToFuelLevel(subtractMiles);

        //If the fuel tank is not empty
        if (!isFuelTankEmpty())
        {            
            if ((getFuelTankLevel() - subtractMilesPercent) >= 0)
            //If there are miles to modify fuel tank level
            {fuelTankLevel -= subtractMilesPercent; 
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
        if (!isFuelTankEmpty() && (getFuelTankLevel() - subtractMilesPercent) >= 0)
        //If the tank is not empty and that if the car were to drive the generated miles
        {
            modifyFuelTankLevel(milesToDrive);
            miles += milesToDrive;
            return "The " + getYear() + " " + 
            getModel () + " drove " + miles + " miles for a milelage of " +
            getMiles() + " and a fuel tank level of " + df.format(getFuelTankLevel()) + "%"; 

        }
        else if ((getFuelLevelInMiles() - milesToDrive) <= 0)
        //if there are not enough miles 
        {
            return "The " + getYear() + " " + getModel () + "'s fuel tank does not have enough to drive " + milesToDrive;
        }
        else
        //fuel tank is empty
        {    
            return "The " + getYear() + " " + getModel () + "'s fuel tank is empty!" ;
        }
    }