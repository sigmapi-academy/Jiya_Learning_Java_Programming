package Methods;


/**
 * Write a description of class Example2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example2
{
    
    public static void main(String[] args){
        System.out.print("\f 2 raised to the power 5 is: " + Math.pow(2, 5));
        Example2 ob = new Example2(); //created object of Example2 class
        // int result = ob.add(10, 15); //calling a non-static method using the object of the class
        int result =  Example1.add(2,5);
        System.out.print("\nsum = " + result);
    }
}
