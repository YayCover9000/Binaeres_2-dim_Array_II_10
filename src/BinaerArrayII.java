public class BinaerArrayII {
    public static void ausgeben(int matrix[][]) {
        for (int [] j : matrix) {
            System.out.print("\nZeile " + j + " :");
            for (int i : j) {
                System.out.print(" " + i);
            }

        }
    }
}
