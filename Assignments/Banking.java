//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

import java.util.Scanner;
public class Banking
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      
      
    
       
       
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
      Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
      
      
      acct1.deposit (25.85);

      double gomezBalance = acct2.deposit (500.00);
      System.out.println ("Gomez balance after deposit: " +
                          gomezBalance);

      System.out.println ("Gomez balance after withdrawal: " +
                          acct2.withdraw (430.75, 1.50));

      acct3.withdraw (800.00, 0.0);  // exceeds balance

      Scanner scan  = new Scanner(System.in);
      System.out.print("Enter amount to transfer");
      double trans = scan.nextDouble();
      
      
      acct1.transfer(trans, 102.56, acct2);
      
      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();

      
      
      
      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
      
      
  
      System.out.println("Would you like to open a new account? (Y/N)");
      String response = scan.nextLine();
      
      if (response =="Y" || response=="y"){
          System.out.println("What is the name under the account? ");
          String name = scan.nextLine();
          System.out.println("What is your account number? ");
          int num = scan.nextInt();
          Account acct4 = new Account(name, num, 0);
        }
      else
          System.out.println("No new account will be made");
      }
      
      
   }

