package MyArray.MultiDimension;


/**
 * Write a description of class One here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class One
{
    public static void main(String[] args){
        System.out.print("\f");
        int[][] A = {{1,2,3}, {4, 5, 6}};
        int i, j;
        for(i = 0; i < A.length; i++){
            for(j = 0; j < A[i].length; j++){
                System.out.print("\t" + A[i][j]);
            }
            System.out.print("\n");
        }
    }
}