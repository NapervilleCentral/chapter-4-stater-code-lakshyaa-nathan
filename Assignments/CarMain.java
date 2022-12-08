
/**
 * Adeline Tse, Lakshyaa
 * 
 * Car Main 
 */
import java.text.*;
import java.util.Random;
public class CarMain
{   public static int GOAL = -1;
    
    public static void main (String[] args)
   {
       Car car1 = new Car (2013, "Benz", 5000, 35.0);
       Car car2 = new Car (2017, "Toyota", 30000, 70.0);
       
       
       getterTest(car1);
       getterTest(car2);
       
       
      Car vw = new Car(1969, "Volkswagon Beetle", 200000, 100);
      
      addMilesTest(vw, 30);
      //call toString of Car after calling addMilesTest
      System.out.println(vw);
      
      milesToFuelLevelTest(car1, 80);
      
      driveTest(car1, car2);
   }
   
   /**
    * Prints out the information for each getter method
    */
   public static void getterTest(Car mine)
   {
       System.out.println("Getter Test");
       System.out.println(mine.getYear());
       System.out.println(mine.getModel());
       System.out.println(mine.getMiles());
       System.out.println(mine.getFuelTankLevel());
       System.out.println("--------------------------------");
   }
   
   /**
    * Takes a car and adds given miles
    * @param Car mine, int miles
    */
   public static void addMilesTest(Car mine, int miles)
   {
        mine.addMiles(miles);
        System.out.println("The car added " + miles + " miles and now has " + mine.getMiles()+" miles.");
   }
   
   /**
    * Takes a car and adds given miles
    * @param Car object
    */
   public static void isFuelTankEmptyTests(Car mine)
   {
       if(mine.isFuelTankEmpty())
       {
           System.out.println("Better start Walking");
       }
   }
   
   /**
    * Takes a car and converts the given miles to a percentage
    * @param Car mine, int miles
    */
   public static void milesToFuelLevelTest(Car mine, int miles)
   {
       DecimalFormat df = new DecimalFormat("0.##"); 
       double percentage = mine.milesToFuelLevel(miles);
       System.out.println(mine.getModel() +  " has " + df.format(percentage) + "% out of the fuel tank maximum(400)");
   }
   
   /**
    * Takes a car and tests the method the given miles to a percentage
    * @param Car mine, int miles
    */
   public static void modifyFuelTankLevelTest(Car mine, int subtractMiles)
   {
       DecimalFormat df = new DecimalFormat("0.##");
       mine.modifyFuelTankLevel(subtractMiles);
       double percentage = mine.getFuelTankLevel();
       System.out.println(mine.getModel() +  " has " + df.format(percentage) + "% out of the fuel tank maximum(400)");
   }
   
   /**
    * Races two cars. Uses two different methods of random amount of miles generated. One is in the parameters and one is done inside the method when overloaded.
    * @param Car car1, Car car2
    */
   public static void driveTest(Car car1, Car car2)
   {
       
       System.out.println("\nCAR RACE!!!");
       int count1=0, count2=0;
       int GOAL = 100;
       Random random = new Random();
       
       //testing whether the cars can drive 100 miles or more
       boolean car1CanRace = false; 
       boolean car2CanRace = false;  
       if (car1.getFuelLevelInMiles() >= 100) 
          car1CanRace = true;
       if (car2.getFuelLevelInMiles() >= 100) 
          car2CanRace = true;
       /**
        * you can change count as you see fit
        * run loop until one of the Cars drive 100 miles and print out
        * which car "won"
        */
       if (car1CanRace && car2CanRace)  
       //verifies both cars can race
       {
          while (count1 < GOAL && count2 < GOAL)
          {
            /**
             * This while loop will test out drive() with both overloaded methods
             */ 
              
            //check how many miles left in the car has before. Then, subtracting the miles before to after
             double milesBefore1 = car1.getFuelLevelInMiles();
             System.out.println("Miles before driving " + milesBefore1);
             int car2RandomMiles = random.nextInt(10) + 1;
             
             //car1 drives without parameters and car2 drives with the same formula, but with the random number in the parameters
             System.out.println("\n" + car1.drive());
             System.out.println("\n " + car1.getModel()+ " has driven " + count1 + " miles" );
             System.out.println("\n" + car2.drive(car2RandomMiles));
             System.out.println("\n " + car2.getModel()+ " has driven " + count2 + " miles" );
             
             double milesAfter1 = car1.getFuelLevelInMiles();
             System.out.println("miles after driving: " + milesAfter1);
             // Print the drive results (uses toString method)
             System.out.println ("Drive results: "+car1+"\n"+car2);
             
             
             // Increment the counters by the miles the car drove
             count1+= milesBefore1 - milesAfter1;
             count2+= car2RandomMiles;
             

          }
      }
      else if (!(car1CanRace) && !(car2CanRace))
      //If neither can race
      {
        System.out.println("Both cars do not have enough fuel in their tank to race :(");
        }
      else if (!(car1CanRace))
      {
        System.out.println(car1.getModel() + " does not have enough fuel in its tank to race :(");
        }
      else if (!(car2CanRace))
      {
        System.out.println(car2.getModel() + " does not have enough fuel in its tank to race :(");
        }
      
      //Print out who won  
      if ((count1 >= GOAL) && (count2 >= GOAL))
          System.out.println(car1.getModel() + " and " + car2.getModel() + " tied!");
      else if(count1 >= GOAL)
          System.out.println(car1.getModel() + " won!");
      else if(count2 >= GOAL)
          System.out.println(car2.getModel() + " won!");
    }
   
}

