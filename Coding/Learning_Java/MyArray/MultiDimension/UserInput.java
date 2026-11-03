package MyArray.MultiDimension;
import java.util.*;


/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] A = new int[rows][cols];
        int r, c;
        for(r = 0; r < A.length; r++){
            for(c = 0; c < A[r].length; c++){
                System.out.print("Enter intgeger value in A["+r+"]["+c+"]: ");
                A[r][c] = sc.nextInt();
            }
        }
        
        //Display 2-D array
        for(r = 0; r < A.length; r++){
            for(c = 0; c < A[r].length; c++){
                System.out.print("\t" + A[r][c]);
            }
            System.out.print("\n");
        }
        
    }
}