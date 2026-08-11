package MyArray;
import java.util.*;


/**
 * Write a description of class MyArrayDemo1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArrayDemo1
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("\f");
        // int i, a[], size = 5;
        // a = new int[size];
        // a[0] = 100;
        // a[1] = 200;
        // a[2] = 300;
        // a[3] = 400;
        // a[4] = 500;
        // System.out.print("\na[");
        // for(i = 0; i < a.length - 1 ; i++){
            // System.out.print(a[i]+", ");
        // }
        // System.out.print(a[i]+"]\n");
        
        // Declaration of array along with initialization
        int a[] = {10, 20, 30, 40, 50};
        int i;
        System.out.print("\na[");
        for(i = 0; i < a.length - 1 ; i++){
            System.out.print(a[i]+", ");
        }
        System.out.print(a[i]+"]\n");
    }
}
