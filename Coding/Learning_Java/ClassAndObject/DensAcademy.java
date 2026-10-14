package ClassAndObject;


/**
 * Write a description of class DensAcademy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DensAcademy
{
    public static void main(String[] args){
        System.out.print("\f");
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        // Student st4 = new Student();
        // Student st5 = new Student();
        // Student st6 = new Student();
        
        st1.insert_info();
        st2.insert_info();
        st3.insert_info();
        // st4.insert_info();
        // st5.insert_info();
        // st6.insert_info();
        
        st1.display_info();
        st2.display_info();
        st3.display_info();
        // st4.display_info();
        // st5.display_info();
        // st6.display_info();
    }
}