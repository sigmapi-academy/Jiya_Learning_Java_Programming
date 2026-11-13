package MyArray.Sorting;
import java.util.*;


/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public void bubbleSort(int A[]){
        int i, j;
        for(i = 0; i < A.length - 1; i++){
            for(j = 0; j < A.length - 1 - i; j++){
                if(A[j] > A[j+1]){
                    int t = A[j];
                    A[j] = A[j+1];
                    A[j+1] = t;
                }
            }
        }
    }
    
    public void printArray(int A[], String msg){
        System.out.print("\n" + msg + "\n[");
        int i; 
        for(i = 0; i < A.length - 1; i++){
            System.out.print(A[i]+", ");
        }
        System.out.print(A[i]+"]\n");
    }
    
    public int[] createRandomArray(int size){
        int A[] = new int[size];
        Random r = new Random();
        int i;
        for(i = 0; i < size; i++){
            A[i] = r.nextInt(10, 100);
        }
        return A;
    }
}