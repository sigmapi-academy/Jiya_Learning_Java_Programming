package Methods;


/**
 * Write a description of class Example1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example1
{
    //Method declaration
    public static int add(int a, int b){
        int sum = a+b; //method body
        displaySum(a, b);
        return sum; //return statement
    }
    
    public void displaySum(int x, int y){
        System.out.print("\nSum = " + add(x, y));
    }
    
    public static void main(String[] args){
        System.out.print("\f 2 raised to the power 5 is: " + Math.pow(2, 5));
        Example1 ob = new Example1(); //created object of Example1 class
        // int result = ob.add(10, 15); //calling a non-static method using the object of the class
        int result =  add(2,5);
        System.out.print("\nsum = " + result);
        
        ob.displaySum(3, 7);
    }
}