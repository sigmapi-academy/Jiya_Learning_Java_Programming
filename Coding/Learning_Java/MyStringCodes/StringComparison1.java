package MyStringCodes;
import java.util.*;


/**
 * Write a description of class StringComparison1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringComparison1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        String str1, str2, str3, str4, str5;
        str1 = new String("Java");
        str2 = new String ("JAVA");
        str3 = new String("Java");
        if(str1.equals("Java")){
            System.out.print("\nBoth the string content is same.");
        }
        else{
            System.out.print("\nContent is not same!");
        }
        
        if(str1.equals(str2)){
            System.out.print("\nBoth the string content is same.");
        }
        else{
            System.out.print("\nContent of str2 is not same!");
        }
        
        if(str1.equalsIgnoreCase(str2)){
            System.out.print("\nBoth the string content is same after ignoring the case.");
        }
        else{
            System.out.print("\nContent of str2 is not same!");
        }
        
        if(str1 == str3){
            System.out.print("\nBoth the references are same");
        }
        else{
            System.out.print("\nBoth the references are not same");
        }
        // System.out.print("\nstr4 = \"Java\";\nstr5 = str1;");
        str4 = "Java";
        // str5 = str1;
        str5 = "Java";
        System.out.print("\nstr4 = \"Java\";\nstr5 = \"Java\";");
        if(str4 == str5){
            System.out.print("\nValue stored in string constant pool");
            System.out.print("\nBoth references are same");
        }
        else{
            System.out.print("\nBoth the references are not same");
        }
    }
}