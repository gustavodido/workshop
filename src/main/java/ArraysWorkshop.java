import java.util.Arrays;

public class ArraysWorkshop {
    public int[] reverse(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length / 2; i++) {
            reversedArray[i] = array[array.length - i - 1];
            reversedArray[array.length - i - 1] = array[i];
        }

        return reversedArray;
    }

    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 1; j < sortedArray.length - i; j++) {
                if (sortedArray[j] < sortedArray[j - 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j - 1];
                    sortedArray[j - 1] = temp;
                }
            }
        }

        return sortedArray;
    }

}
