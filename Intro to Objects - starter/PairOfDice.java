// student outline of Pair of Dice

public class PairOfDice
{
    //private data-- 2 die

    private Die die1, die2;



    /**---------- Default Constructor
        Creates two six-sided Die objects, both with an initial
        face value of one.
    */

    public PairOfDice(){
        die1 = new Die();
        die2 = new Die();
    }


    /**----------- roll()
        Rolls both dice and returns the combined result.
        @return int
    */
    private int sum(){
        int add = die1.roll() + die2.roll();
        return add;
    }

//********************************************************************
//  SnakeEyes.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a class with overloaded constructors.
//********************************************************************

public class SnakeEyes
{
   //-----------------------------------------------------------------
   //  Creates two die objects, then rolls both dice a set number of
   //  times, counting the number of snake eyes that occur.
   //-----------------------------------------------------------------
   public void main(String[] args)
   {
      final int ROLLS = 500;
      int snakeEyes = 0, num1, num2;

      Die die1 = new Die();    // creates a six-sided die
      Die die2 = new Die(20);  // creates a twenty-sided die
      Die die3 = new Die (1);  // creates an invalid die -- so sides are 6

      for (int roll = 1; roll <= ROLLS; roll++)
      {
         num1 = die1.roll();
         num2 = die2.roll();
         
         if (num1 == num2 && num1 == 1)
             snakeEyes++;
      }

      System.out.println ("Number of rolls: " + ROLLS);
      System.out.println ("Number of snake eyes: " + snakeEyes);
      System.out.println ("Ratio: " + (double)snakeEyes/ROLLS);
      System.out.println("");
      System.out.println(die3.getFaceValue());
      System.out.println("die2's roll results in " + die2.roll());
      System.out.println(die2);
   }
}


    /**-------------- getTotal()
        Returns the current combined dice total.
        @return
    */




    /**---------------- getDie1()
        Returns the current value of the first die.
        @return
    */


    /**------------- getDie2()
        Returns the current value of the second die.
        @return
    */


    /**------------- toString()
            Returns the current data for each die
            hint: use methods in die to build the String to return
            @return
    */




}
