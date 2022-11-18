//********************************************************************
//  Die.java
//********************************************************************
import java.util.Random;

public class Die
{
   private final int MIN_FACES = 4;
   private static Random gen = new Random();
   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   /**
     Defaults to a six-sided die. Initial face value is 1.
   */
   public Die ()
   {
      numFaces = 6;
      faceValue = 1;
   }

   /**
     Secondary constructor: Explicitly sets the size of the die. Defaults to a size of
     six if the parameter is invalid < MIN_FACES.
     Initial face value is random.
     @parm int number of sides of the die
   */
   public Die(int num)
   {
       if (num <= 3)
           numFaces = 6;
       else
           numFaces = num;
   }

   /**
     Rolls the die and returns the result.
     @return int faceValue
   */
   public int roll ()
   {
      faceValue = gen.nextInt(numFaces) + 1;
      return faceValue;
   }

   /**
      Returns the current die value.
      @return int facevalue
   */
   public int getFaceValue ()
   {
      return faceValue;
   }

   /**
        Returns the current number of faces the die has.
        @return int numfaces
   */
   public int getNumFaces ()
   {
       return numFaces;
   }

   /**
          Sets the number of faces of the Die
          @param int num
   */
   public int setFaces (int num)
   {
       if (num <= 3)
           numFaces = 6;
       else
           numFaces = num;
           
       return numFaces;
   }

   /**
           Returns the current die value and number of sides as a String.
           @return String data
   */
   public String methodName ()
   {
      String data = "Number of faces: " + numFaces + 
                    "Current face value: " + faceValue;
      return data;
   }
}//end of calss Die
