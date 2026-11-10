package MyArray.MultiDimension;
import java.util.stream.*;
import java.io.*;
import java.util.*;


/**
 * Write a description of class MyJaggedArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyJaggedArray
{
    static Scanner sc = new Scanner(System.in);
    public int[][] getJaggedArray(int rows){
        int[][] arr = new int[rows][];
        int i, numOfElements;
        for(i = 0; i < rows; i++){
            System.out.print("\nNumber of elements in row " + i+": ");
            numOfElements = sc.nextInt();
            arr[i] = new int[numOfElements];
        }
        return arr;
    }
    
    public void input(int[][] jA){
        
        int i, j;
        System.out.print("\nData input in Jagged Array:\n");
        for(i = 0; i < jA.length; i++){
            for(j = 0; j < jA[i].length; j++){
                System.out.print("Enter value in jA["+i+"]["+j+"]: ");
                jA[i][j] = sc.nextInt();
            }
        }
    }
    
    public void printJaggedArray(int[][] jA){
        int i, j;
        System.out.print("\nData in Jagged Array:\n");
        for(i = 0; i < jA.length; i++){
            for(j = 0; j < jA[i].length; j++){
                System.out.print("\t"+jA[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    public int[][] getJaggedArrayUsingStream(){
        int[][] jA = Stream.of(
            new int[]{1,2},
            new int[]{3,4,5},
            new int[]{6,7,8,9}).toArray(int[][]::new);
        return jA;
    }
}