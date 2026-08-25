package MyStringCodes;
import java.util.*;

/**
 * Write a description of class NumberOfConsonantsAndVowels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberOfConsonantsAndVowels
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any sentence: ");
        String str = sc.nextLine();
        int i, v = 0, conso = 0;
        String vowels = "AEIOUaeiou";
        String la="a", ua = "A";
        for(i = 1; i < 26; i++){
            //concatenation means joing of two strings.
            la += (char)(la.charAt(i-1) + 1); //explicit type casting
            ua += (char)(ua.charAt(i-1) + 1); //explicit type casting
        }
        System.out.print("\n" + la + "\n" + ua + "\n");
        for(i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if((la.indexOf(c) != -1 || ua.indexOf(c) != -1)){
                if(vowels.indexOf(c) > -1){
                    v++;
                }   
                else{
                    conso++;
                }
            }
        }
        System.out.print("\nVowels count: " + v);
        System.out.print("\nCosonant count: " + conso);
    }
}
