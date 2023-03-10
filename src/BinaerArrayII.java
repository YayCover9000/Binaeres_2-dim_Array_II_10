public class BinaerArrayII {
    public static void ausgeben(int matrix[][]) {
        int[] zwischenSpeicherArray;
        int p = 0;
        int ausgabeSubArray = 0;
        int steiger = 0;
        int heber = 0;

        for (int [] j  : matrix) {
            // System.out.print("\nZeile " + heber + " :");
            steiger++;
            for (int i : j) {
                //System.out.print(" " + i + "\t");
                // Immer wenn im Subarray Matrix ein Zähler hochgesetzt.
                if (i == 0) {
                    p++;
                    //System.out.print(" [P: " + p + "]");
                }
            }
            // Diese Zeile enthällt eine gerade Anzahl an Nullen
            if (p % 2 == 0 && p > 0) {
                System.out.print("\nZeile " + heber + " :");
                //System.out.println("\tZeile mit gerade Anzahl Nullen: " + heber);
            }
                //System.out.println(" Anzahlen Nullen:\t" + p);
            p = 0;
            heber++;
        }
    }
}
