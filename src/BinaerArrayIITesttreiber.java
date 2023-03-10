import java.util.Scanner;
import java.lang.Math;
public class BinaerArrayIITesttreiber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int eingabe;
        int zufall;
        int l = 15;
        /* Test Values
        eingabe = 3;
         */
         System.out.println("Array Größe: ");
        eingabe = scanner.nextInt();

        int zweiDimMatrix [][] = new int[eingabe][eingabe];
        for (int f = 0; f < zweiDimMatrix.length; f++) {
            for (int k = 0; k < zweiDimMatrix[f].length; k++) {
                //l = (int)Math.round(Math.random());
                zweiDimMatrix[f][k] = l;
            }
        }
        BinaerArrayII.ausgeben(zweiDimMatrix);

        scanner.close();
    }
}
