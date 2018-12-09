import AlgoTools.IO;

public class PancakeSortLsg {
    /**
     * Dreht die Reihenfolge der ersten <tt>count</tt> Element in
     * <tt>array</tt> um.
     *
     * @param array das zu sortierende Array
     * @param count Anzahl zu flippender Elemente
     *
     * @throws RuntimeException wenn <tt>count</tt> > <tt>array.length</tt>
     */
    public static void flip(int[] array, int count) {
        // Maximal alle Elemente flippen
        if (count > array.length) {
          throw new RuntimeException("Count muss <= array.length sein!");
        }

        for (int i = 0; i < count/2; i++) {
            int tmp = array[i];
            array[i] = array[count - 1 - i];
            array[count - 1 - i] = tmp;
        }
    }

    /**
     * Gibt ein Array auf dem Terminal aus
     *
     * @param array Das auszugebene Array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            IO.print(array[i] +  ", ", 5);
        }
        IO.println(array[array.length - 1], 3);
    }

    /**
     * Sortiert das gegebene <tt>array</tt> mit dem PancakeSort Verfahren
     *
     * @param array zu sortierendes Array
     */
    public static void sort(int[] array) {
        // Von hinten alle Stellen mit den größten Elementen auffüllen
        for (int end = array.length; end > 1; end--) {
            // Maximum im unsortierten Teil finden
            int max = array[0];
            int maxPos = 0;
            for (int i = 1; i < end; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxPos = i;
                }
            }

            // Erst das Maximum nach vorne flippen ...
            flip(array, maxPos + 1);

            // ... danach den ganzen unsortierten Teil flippen, um das Maximum
            // ans Ende des unsortierten Teils zu bekommen.
            flip(array, end);
        }
    }

    public static void main(String[] args) {
        int[] input = IO.readInts("Bitte eine Zahlenfolge eingeben: ");
        IO.print("Eingabe : ");
        printArray(input);

        sort(input);
        IO.print("Sortiert: ");
        printArray(input);
    }
}
