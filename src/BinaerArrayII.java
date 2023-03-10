public class BinaerArrayII {
    public static void ausgeben(int matrix[][]) {
        int[] zwischenSpeicherArray;
        int p = 0;
        int ausgabeSubArray =0;
        int i = 1;
        int j = 2;

        /*for (int [] j  : matrix) {
            System.out.print("\nZeile " + j + " :");
            for (int i : j) {
                //System.out.print(" " + i);
                // Immer wenn im Subarray Matrix ein Zähler hochgesetzt.
                if (i == 0) {
                    p++;
                    System.out.print("NULL");
                }
            }
            for (int q = p; q <= p; p--) {
                System.out.print(" HELLO\t");
            }
        }*/
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
        for (int [] e : matrix) {
            System.out.println("TZEST: " + matrix[i][i] + "\t" + matrix[j][j]);
        }
    }
}
