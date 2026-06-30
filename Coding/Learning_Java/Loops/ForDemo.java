package Loops;
import java.util.*;


/**
 * Write a description of class ForDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForDemo
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.print("\fEnter number of terms: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            System.out.print("\n" + i);
        }
        
        for(i = 1; i <= n; i+=2){
            System.out.print("\n" + i);
        }
        
    }
}