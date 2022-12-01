
/**
 * Write a description of class CarMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarMain
{   public static int GOAL = 100;
    public static void main (String[] args)
   {
       int count1=0, count2=0;
       
       //call toString of Car after calling addMilesTest
       
       /**
        * you can change count as you see fit
        * run loop until one of the Cars drive 100 miles and print out
        * which car "won"
        */
       while (count1 < GOAL && count2 < GOAL)
      {
         car1.drive();
         car2.drive(5);

         // Print the drive results (uses Coin's toString method)
         System.out.print ("Car 1: " + car1);
         System.out.println ("   Car 2: " + car2);

         // Increment the counters
         
      }
   }
   /**
    * Prints out the information for each getter method
    */
   public static void getterTest(Car mine)
   {
   }
   
   /**
    * Takes a car and adds given miles
    * @param 
    */
   public static void addMilesTest(Car mine, int miles)
   {
   }
   /**
    * Takes a car and adds given miles
    * @param 
    */
   public static void isFuelTankEmptyTests(Car mine)
   {
       if(mine.isFuelTankEmpty())
       {
           System.out.print("Better start Walking");
       }
   }
   
}
