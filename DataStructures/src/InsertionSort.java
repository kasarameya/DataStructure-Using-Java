/**
 * This algorithm sorts the given array of elements in their ascending order
 * Time complexity is O(n^2) and hence this algorithm should only be used for small
 * input size. But this algorithm is considered to better than Bubble and Selection sorts
 * Created by ©Ameya on 2/21/2018 at 12:19 AM.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] elements = {4, 2, 5, 88, -1, 7, 9};
        insertionSort(elements);
        for (int k = 0; k < elements.length; k++) {
            System.out.println(elements[k]);
        }
    }

    /**
     * This method sorts the provided input elements
     * using the iterative approach. At any given time,
     * all the elements from A[0 ... i-1] will be sorted.
     *
     * @param elements to be sorted
     */

    private static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            int j = i - 1;
            while (j >= 0 && elements[j] > key) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = key;
        }
    }
}

