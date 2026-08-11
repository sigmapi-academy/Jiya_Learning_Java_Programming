package MyArray;
import java.util.*;


/**
 * Write a description of class InputAndOutputInSDA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputAndOutputInSDA
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("\f");
        int i, A[], size;
        System.out.print("How many elements? ");
        size = sc.nextInt();
        A = new int[size];
        
        for(i = 0; i < size; i++){
            System.out.print("Enter value in A["+i+"]: ");
            A[i] = sc.nextInt();
        }
        
        System.out.print("\nA[");
        for(i = 0; i < size - 1; i++){
            System.out.print(A[i] + ", ");
        }
        System.out.print(A[i] + "]\n ");
    }
}
