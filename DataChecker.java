/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dtmanager;

/**
 *date: 17/Nov/17
 * Written by: AliceKobusinge 
 * Description: this interface declares  four methods which are overridden as validate methods 
 *              they are all necessary to check whether the data entries are of expected order.
 *              It is Written in Java in Window platform
 */

public interface DataChecker 
{
    //validates plain text
    public int validate(String[] Text);
    //tests password matches
    public int validate(String PassWord1, String PassWord2);
    //verifies the phone number
    public int validate(String Contact);
    //checks numerical values for validity
    public int validate(int[] numbers);
}
