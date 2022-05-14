package ucup.topekox;

import java.util.Arrays;

public class DemoArrayClass {
    public static void main(String[] args) {
        int[] numbers = {
                1, 34, 45, 67, 55, 4, 78, 45
        };

        Arrays.sort(numbers); // mengurutkan array
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 4)); // mencari value array return index

        int[] result = Arrays.copyOf(numbers, 5); // copy array berdasarkan jumlahnya
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 4, 6); // copy array dari x sampai y
        System.out.println(Arrays.toString(result2));
    }
}
