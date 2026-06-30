package Loops;
import java.util.*;


/**
 * Write a description of class NumberOfDigits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberOfDigits
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, count;
        System.out.print("\fEnter any number: ");
        num = sc.nextInt();
        for(count = 0; num > 0; num /= 10){
            count++;
        }
        System.out.print("\nNumber of digits: " + count);
    }
}