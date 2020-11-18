import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Afvink1 {

    public static void insertionSort(Integer[] array) {

        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String[] a){

        Random rand = new Random();
        ArrayList<Integer> getalarray = new ArrayList<>();
        int max = 100;
        int j = 0;
        while (j < 10) {
            int int_random = rand.nextInt(max);
            getalarray.add(int_random);
            j++;
        }

        Integer[] array = new Integer[getalarray.size()];
        array = getalarray.toArray(array);

        System.out.println("Begin sorteren");
        long start = System.currentTimeMillis();
        insertionSort(array);
        long end = System.currentTimeMillis();
        System.out.println("Klaar met sorteren");

        float tijd = (end - start) / 1000F;
        System.out.println(Arrays.toString(array));
        System.out.println(tijd + " sec");
    }
}