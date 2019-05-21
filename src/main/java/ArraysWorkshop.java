import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.google.common.primitives.Ints.asList;

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

    public int[] merge(int[] first, int[] second) {
        int[] mergedArray = Arrays.copyOf(first, first.length + second.length);

        Set<Integer> foundElements = new HashSet<>(asList(first));
        int addedElements = 0;

        for (int i = 0; i < second.length; i++) {
            if (!foundElements.contains(second[i])) {
                foundElements.add(second[i]);
                mergedArray[first.length + addedElements] = second[i];
                addedElements++;
            }
        }

        return Arrays.copyOfRange(mergedArray, 0, first.length + addedElements);
    }

}
