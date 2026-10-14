package ClassAndObject;
import java.util.*;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    int roll_no;
    byte std;
    String name;
    float marks[];
    static int numOfSubjects = 5;
    static Scanner sc = new Scanner(System.in);
    void insert_info(){
        System.out.print("\nEnter roll number: ");
        roll_no = sc.nextInt();
        System.out.print("\nEnter standard: ");
        std = sc.nextByte();
        sc.nextLine(); //to remove keyboard buffer.
        System.out.print("\nEnter name: ");
        name = sc.nextLine();
        marks = new float[numOfSubjects];
        int i;
        String subjects[] = {"English", "Math", "Kanada", "Science", "Humanities"};
        for(i = 0; i < numOfSubjects; i++){
            System.out.print("\nEnter the marks of " + subjects[i]+": ");
            marks[i] = sc.nextFloat();
        }
    }
    
    void display_info(){
        System.out.print("\n===========================");
        System.out.print("\n===+Student Information+===");
        System.out.print("\n===========================");
        System.out.print("\nRoll number: " + roll_no +
        "\nName: " + name + 
        "\nStandard: " + std +
        "\nMarks: ");
        int i ;
        for(i = 0; i < numOfSubjects - 1; i++){
            System.out.print(marks[i]+ ", ");
        }
        System.out.println(marks[i]); //print the marks first and then change the line
    }
}