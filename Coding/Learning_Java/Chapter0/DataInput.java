package Chapter0;
import java.util.*;


/**
 * Write a description of class DataInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataInput
{
    public static void main(String[] args){
        boolean b;
        byte bt;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        String str;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter boolean value(true/false): ");
        b = sc.nextBoolean();
        System.out.print("\nEnter any byte value: ");
        bt = sc.nextByte();
        System.out.print("\nEnter any short integer value: ");
        s = sc.nextShort();
        System.out.print("\nEnter integer value: ");
        i = sc.nextInt();
        System.out.print("\nEnter long integer value: ");
        l = sc.nextLong();
        System.out.print("\nEnter float value: ");
        f = sc.nextFloat();
        System.out.print("\nEnter double value: ");
        d = sc.nextDouble();
        System.out.print("\nEnter a single character: ");
        c = sc.next().charAt(0);
        sc.nextLine(); //remove keyboard buffer
        System.out.print("\nEnter any String: ");
        str = sc.nextLine();
        System.out.print("\n b = " + b +
                        "\n bt = " + bt +
                        "\n s = " + s + 
                        "\n i = " + i +
                        "\n l = " + l +
                        "\n f = " + f +
                        "\n d = " + d + 
                        "\n c = " + c +
                        "\n str = " + str);
    }
}