/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dtmanager;

/**
 *date: 17/Nov/17
 * Written by: DorothyAnkunda 
 * Description: this interface declares two methods 
 *              generateMessage Which gathers up groups of messages to display according to given conditions.
 *              displayMessage Which prepares a single string of message to be displayed.
 *              It is Written in Java in Window 
 */

public interface Messenger {
    // 
    public void generateMessage(int[] Result);
    // 
    public void displayMessage();
}