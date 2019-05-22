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

    private boolean internalBinarySearch(int[] array, int element, int low, int high) {
        if (high < low) {
            return false;
        }

        int middle = (low + high) / 2;

        if (array[middle]== element) {
            return true;
        } else if (array[middle] > element) {
            return internalBinarySearch(array, element, middle + 1, high);
        } else {
            return internalBinarySearch(array, element, low, middle - 1);
        }

    }

    public boolean binarySearch(int[] array, int element) {
        return internalBinarySearch(array, element, 0, array.length);
    }

    public int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];

        for(int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            int multiple =  (int)Math.ceil(grade / 5d) * 5;
            int difference = multiple - grade;

            if (grade < 38 || difference >= 3) {
                result[i] = grade;
            }
            else {
                result[i] = multiple;
            }
        }

        return result;
    }
}
