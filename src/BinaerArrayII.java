public class BinaerArrayII {
    public static void ausgeben(int matrix[][]) {
        int[] zwischenSpeicherArray;
        int p = 0;
        int ausgabeSubArray = 0;
        int steiger = 0;
        int heber = 0;

        for (int [] j  : matrix) {
            System.out.print("\nZeile " + matrix[steiger][heber] + " :");
            steiger++;
            for (int i : j) {
                System.out.print(" " + i + "\t");
                // Immer wenn im Subarray Matrix ein Zähler hochgesetzt.
                if (i == 0) {
                    p++;
                }

            }
                System.out.println(" Anzahlen Nullen:\t" + p);
            p = 0;
            heber++;
        }
        /*for (int[] e : matrix) {

        }
        for ( int w = 0; w < matrix.length; w++) {
            System.out.print("\nZeile " + w + " :");
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(" " + i);
                if (i == 0) {
                    p++;
                    //System.out.print("NULL");
                }
            }
        }*/
        /*for (int [] e : matrix) {
            System.out.print("TZEST: " + matrix[i][j]);

            for (int [] r : matrix) {
                System.out.println("\n\t=>: " + matrix[i][j]);
                j++;
            }
            i++;
        }*/
    }
}
