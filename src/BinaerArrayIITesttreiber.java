import java.util.Scanner;
import java.lang.Math;
public class BinaerArrayIITesttreiber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array Größe: ");
        int eingabe;
        eingabe = scanner.nextInt();
        int zufall;
        int laengeErstesArray = eingabe;
        int laengeZweitesArray = eingabe;
        /* Test Values
        eingabe = 3;
         */


        int zweiDimMatrix [][] = new int[laengeErstesArray][laengeZweitesArray];
        for (int f = 0; f < zweiDimMatrix.length; f++) {
            for (int k = 0; k < zweiDimMatrix[f].length; k++) {
                zufall = (int)Math.round(Math.random());
                zweiDimMatrix[f][k] = zufall;
            }
        }
        BinaerArrayII.ausgeben(zweiDimMatrix);

        scanner.close();
    }
}
