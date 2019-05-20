import java.util.Arrays;

public class ArraysWorkshop {
    public int[] reverseArray(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length / 2; i++) {
            reversedArray[i] = array[array.length - i - 1];
            reversedArray[array.length - i - 1] = array[i];
        }

        return reversedArray;
    }
}
