//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address
{
   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }

    /** 
     * setAddress will take a new street and change to update information
     * @param String newstreet
     */

    public void setAddress(String newAddress) //void is for not returning anything
    {
       streetAddress = new String (newAddress); 
    }


   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
