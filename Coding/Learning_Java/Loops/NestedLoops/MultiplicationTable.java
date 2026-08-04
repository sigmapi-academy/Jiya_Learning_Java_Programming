package Loops.NestedLoops;
import java.util.*;


/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    public static void main(String args[]){
        int N, M, i, j, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("\f======================================================\n");
        System.out.print("\nMultiplication Tables upto 10 terms for each numbers\n");
        System.out.print("\n======================================================\n");
        System.out.print("Enter starting value: ");
        N = sc.nextInt();
        System.out.print("Enter the end value: ");
        M = sc.nextInt();
        System.out.print("\n======================================================\n");
        for(; N <= M; N++){
            System.out.print("\n======Multiplication table of " + N+" ======\n");
            for(j = 1; j <= 10; j++){
                p = N * j;
                System.out.print("\n"+N+" * " + j + " = " + p);
            }
            System.out.print("\n");
        }
    }
}