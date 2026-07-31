package Loops;

import javax.swing.*;
/**
 * Write a description of class DowhileDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DowhileDemo
{
    public static void main(String[] args){
        int n;
        do{
            String data = JOptionPane.showInputDialog("Enter a positive number", "0");
            n = Integer.parseInt(data);
            if(n > 0){
                break;
            }
            else{
                JOptionPane.showConfirmDialog(null,
                    "\nKindly read the prompt in the input dialog box.");
            }
        }while(true);
        JOptionPane.showConfirmDialog(null, "This is valid input.", "Valid Input", 
        JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
}