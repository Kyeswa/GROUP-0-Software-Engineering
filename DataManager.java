/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dtmanager;
import java.util.ArrayList;

/**
 *date: 19/Nov/17
 * Written by: Kyeswa Lutimba Ivan 
 * Description:  this class implements the DataChecker and Messenger interfaces
 *              It is Written in Java in Window platform
 * 
 */
public class DataManager implements DataChecker, Messenger{
    //Array of strings containing all the neccessary messages to generate
    String[] message = {"There is an empty field","The Passwords Don't match","Invalid Contact","There is  an Invalid Numerical Value","Successful operation","Some text is too long"};
    ArrayList messages = new ArrayList();
    //integer value which determines which message to generate
    //A string which holds the message to generate
    String phrase = "";
    
   //Private method which checks if an array of Strings contains a null value 
    private boolean isNull(String[] words){
          for (String word: words)
          { 
              try
              { 
                  word.length();
              }
              catch(NullPointerException e){
                  return true;
              }
          }
         return false;
      }
    
    //Method which verifies Text.
    public int validate(String[] Text)
    {
        //This means that the data is not login data
        if(Text.length >2)
        {
            if(!this.isNull(Text))
                for(String statement: Text)
            {
                statement.replaceAll("[^a-zA-Z]","");
                statement.toLowerCase();
                if(statement.length()>100) return 5;
            }  
            else return 0;
        }
     
        //if it is login Data the we check for empty fields
        else
        {
            //Testing if there are any empty fields
            if(this.isNull(Text)) return 0;
        }
        return 4;
    }
    
    //This methods compares if the passwords match
    public int validate(String PassWord1, String PassWord2)
    {
        if(PassWord1.equals(PassWord2)) return 4;
        else return 1;
    }
    
    //This method validates the phone Number if it is correct.
    public int validate(String Contact)
    {
        //An array of Characters of the phone number;
        char[] phone = Contact.toCharArray();
        boolean NoLetters = true;
        //Loop to check if there are alphabatical characters in the phone number
        for(char C: phone)
        {
            if(Character.isAlphabetic(C)) NoLetters = false;
        }
        //Phone number is correct only if it contains 10 non numerical characters
        if(Contact.length()==10&&NoLetters) return 4;
        else return 2;
    }
    
    //Method which validate numerical values ie if they are not negative
    public int validate(int[] numbers)
    {
        for(int number: numbers)
        {
            if(number < 0) return 3;
        }
        return  4;
    }
}
