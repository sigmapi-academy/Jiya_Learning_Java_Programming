package MyStringCodes;
import java.util.*;


/**
 * Write a description of class StringDemo1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringDemo1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any sentence: ");
        String str = sc.nextLine();
        int i;
        for(i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            System.out.print("\n" + c);
        }
    }
}