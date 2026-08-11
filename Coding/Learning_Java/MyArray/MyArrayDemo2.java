package MyArray;
import java.util.*;


/**
 * Write a description of class MyArrayDemo2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArrayDemo2
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("\f");
        String[] color = {"Red", "Green", "Blue", "Brown",  "Purple", "Pink"};
        Random r = new Random();
        System.out.print("\nSelecting random 3 colours");
        System.out.print("\n1. "+color[r.nextInt(color.length)]);
        System.out.print("\n2. "+color[r.nextInt(color.length)]);
        System.out.print("\n3. "+color[r.nextInt(color.length)]);
    }
}
