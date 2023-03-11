public class BinaerArrayII {
    public static void ausgeben(int matrix[][]) {
        int [] zwischenSpeicherArray;
        int p = 0;
        int ausgabeSubArray = 0;
        int steiger = 0;
        int heber = 0;
        int vorZwischen;

        for (int [] j  : matrix) { // j ist Speicherposition Array 1
            // System.out.print("\nZeile " + heber + " :");
            System.out.print("Array 1 position: " + steiger + "!"); //TODO wie kann ich den Inhalt hier ausgeben anstelle des Speicherplatzes?
            steiger++;
            for (int i : j) { // i ist inhalt Array 2

                // Immer wenn im Subarray Matrix ein Zähler hochgesetzt.
                vorZwischen =heber; //TODO Wie gebe ich Index und nicht Inhalt aus?
                if (i == 0) {
                    p++;
                    //System.out.print(" [P: " + p + "]");
                }
                System.out.print(" Index Array 2: " + vorZwischen + "\t");
            }
            System.out.println("\nBreak");
            // Diese Zeile enthällt eine gerade Anzahl an Nullen
            if (p % 2 == 0 && p > 0) {
                System.out.print("\nZeile " + steiger + " :"); // Ursprünglich heber
                //System.out.print(" " + nullEins + "\t");

                //System.out.println("\tZeile mit gerade Anzahl Nullen: " + heber);
            }
                //System.out.println(" Anzahlen Nullen:\t" + p);
            p = 0;
            heber++;
        }
    }
}
