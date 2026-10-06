package ClassAndObject;

/**
 * Write a description of class TestDog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestDog
{
    public static void main(String[] args){
        System.out.print("\f");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.name = "tintin";
        dog2.name = "Nemo";
        dog3.name= "Polo";
        
        //calling methods
        dog1.bark();
        dog2.bark();
        dog3.bark();
    }
}