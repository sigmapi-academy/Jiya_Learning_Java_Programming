package MyArray;
import java.util.*;


/**
 * Write a description of class InsertAtPosition here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertAtPosition
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of elements: ");
        int n = sc.nextInt();
        //Array has one extra position for insertion. 
        int[] arr = new int[n+1];
        System.out.print("Enter " + n + " elements: ");
        int i;
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element: ");
        int element = sc.nextInt();
        
        System.out.print("Enter position: ");
        int p = sc.nextInt();
        
        //validate position
        if(p < 0 || p > n){
            System.out.print("\nInvalid position.");
        }
        else{
            // Shift elements one position to the right. 
            for( i = n; i > p; i--){
                arr[i] = arr[i-1];
            }
            
            //Insert the new element. 
            arr[p] = element;
            System.out.print("\nArray after insertion: [");
            for(i = 0; i < n; i++){
                System.out.print(arr[i]+", ");
            }
            System.out.print(arr[i]+"]\n");
        }
        
        sc.close();
    }
}