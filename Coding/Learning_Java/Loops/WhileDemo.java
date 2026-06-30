package Loops;
import java.util.*;


/**
 * Write a description of class WhileDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileDemo
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = 1, n;
        System.out.print("\fEnter number of times: ");
        n = sc.nextInt();
        while(start <= n){
            System.out.print("\n" + start+": Hello!");
            start++;
        }
    }
}