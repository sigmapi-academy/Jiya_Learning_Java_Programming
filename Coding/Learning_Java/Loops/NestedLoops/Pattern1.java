package Loops.NestedLoops;
import java.util.*;


/**
 * Write a description of class Pattern1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattern1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j, k, N;
        System.out.print("\fEnter number of rows: ");
        N = sc.nextInt();
        for(i = 0; i < N; i++){
            //loop for printing spaces
            for(j = 0; j < N - i; j++){
                System.out.print("  ");
            }
            //loop to print(digits)
            k = 0;
            for(; k <= i; ){
                System.out.print((k+1)+" ");
                k++;
            }
            System.out.print("\n");
        }
    }
}