import java.util.Scanner;
public class BinaerArrayIITesttreiber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int eingabe = 3;
        /* System.out.println("Array Größe: ");
        eingabe = scanner.nextInt();
         */
        int zweiDimMatrix [][] = new int[eingabe][eingabe];
        BinaerArrayII.ausgeben(zweiDimMatrix);

        scanner.close();
    }
}
