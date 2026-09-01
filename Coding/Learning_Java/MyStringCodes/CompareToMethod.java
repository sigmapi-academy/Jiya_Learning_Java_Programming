package MyStringCodes;


/**
 * Write a description of class CompareToMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompareToMethod
{
    public static void main(String[] args){
        String str1 = new String("Tom");
        String str2 = new String("Tom");
        String str3 = new String("Harry");
        System.out.print("\f"+ str1.compareTo(str2)); // 0
        System.out.print("\n"+ str1.compareTo(str3)); // str1 > str3
        System.out.print("\n"+ str3.compareTo(str2)); // str3 < str2
    }
}