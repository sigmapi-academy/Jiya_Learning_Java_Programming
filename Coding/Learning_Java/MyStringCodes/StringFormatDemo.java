package MyStringCodes;

/**
 * Write a description of class StringFormatDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringFormatDemo
{
    public static void main(String args[]){
        System.out.print("\f");
        double d = 7.3458;
        int age = 40;
        String nm = "James";
        String nn = String.format("%s %s %n%s %d %n%s %.2f", "Student Name: ", nm, "Age: ",
                age, "Has grade: ", d );
        System.out.print("\n" + nn);
    }
}