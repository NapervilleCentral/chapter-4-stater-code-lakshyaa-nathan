//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************

public class Student
{
   private String firstName, lastName;
   private int test1, test2, test3;
   private Address homeAddress, schoolAddress;

   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   Address school, int test1, int test2, int test3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = 0;
      test2 = 0;
      test3 = 0;
   }

   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;
      result += "Test Score 1: \n" + test1; 
      result += "Test Score 2: \n" + test2;  
      result += "Test Score 3: \n" + test3; 
      
      return result;
   }
   
   /**
    * GetTestScore
    * @param int testNum, int score
    * accepts test number and returns score
    */
   public void SetTestScore(int testNum, int score)
   {
    if (testNum == 1)
        test1 = score;
    else if (testNum == 2)
        test2 = score;
    else if (testNum == 3)
        test3 = score;
    
    }
    
   /**
     * Average 
     * @param int test1, int test2, int test3
     * calculates the average
     */
    
    private double Average(int test1, int test2, int test3){
        return (test1+test2+test3)/3;
    }
    
   /**
    * gettestScore
    */
   public void SetTestScore(int testNum)
   {
    if (testNum == 1)
        return test1;
    else if (testNum == 2)
        return test1;
    else if (testNum == 3)
        return test1;
    
    }
}
