package Loops;

import javax.swing.*;
/**
 *  Write a description of class PalindromeOrPerfect here.
 *  Write a menu driven program to accept a number from the user. 
 *  Check and display whether it is a Palindrome or a Perfect number. 
 *  (a) Palindrome number: (A number is a Palindrome which when read in 
 *  the reverse order is the same as the original number) 
 *  Example: 11, 101, 151, etc. 
 *  (b) Perfect number: (A number is called Perfect if it 
 *  is equal to the sum of its
 *  factors other than the number itself.) 
 *  Example: 6 
 *  1 + 2 + 3 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PalindromeOrPerfect
{
    public static void main(String[] args){
        String choice, input, output="";
        String menu = "\nPress 1 for palindrome"+
            "\nPress 2 for perfect number"+
            "\nPress 3 for exit"+
            "\nEnter your choice: ";
        do{
            choice = JOptionPane.showInputDialog(menu, "1");
            switch(choice){
                case "1": 
                    input = JOptionPane.showInputDialog(null, 
                        "Enter any positive number: ");
                    int num = Integer.parseInt(input);
                    int rev = 0, t = num;
                    do{
                        rev = rev * 10 + t % 10;
                        t = t / 10;  
                    }while(t > 0);
                    if(num == rev){
                        JOptionPane.showMessageDialog(null, "Palindrome", 
                            "Check Palindrome", JOptionPane.OK_OPTION);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Not Palindrome", 
                            "Check Palindrome", JOptionPane.OK_OPTION);
                    }
                    break;
                case "2":
                    input = JOptionPane.showInputDialog(null, 
                        "Enter any positive number: ");
                    num = Integer.parseInt(input);
                    int sum = 0, d = 1; t = num;
                    do{
                        if(t % d == 0){
                            sum += d;
                        }
                        d++;
                    }while(d <= t/2);
                    if(sum == num){
                        JOptionPane.showMessageDialog(null, "Perfect number", 
                            "Check Perfect", JOptionPane.OK_OPTION);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Not a Perfect Number", 
                            "Check Perfect", JOptionPane.OK_OPTION);
                    }
                    break;
                case "3":
                      JOptionPane.showMessageDialog(null, "Exiting...", 
                            "Exit", JOptionPane.OK_OPTION); 
                    System.exit(3);
                default:
                    JOptionPane.showMessageDialog(null, "Wrong option Selected", 
                            "Menu message", JOptionPane.OK_OPTION);
            }

        }while(true);
    }
}