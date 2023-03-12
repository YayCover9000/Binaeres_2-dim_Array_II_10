public class BinaerArrayII {
    public static void ausgeben(int matrix[][]) {
        int p = 0;

        for (int y = 0; y < matrix.length; y++){
            for(int z = 0; z < matrix[y].length; z++) {
                if (matrix[y][z] == 0){
                    p++;
                }
            }
            if(p%2 == 0) {
                System.out.print("Zeile " + y + ": ");
                for (int z = 0; z < matrix[y].length; z++) {
                    System.out.print(matrix[y][z] + " ");
                }
                System.out.print("\n");
            }

        }
    }
}
