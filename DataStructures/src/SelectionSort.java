/**
 * This algorithm sorts the given array of elements in their ascending order
 * Time complexity is O(n^2) and hence this algorithm should only be used for small
 * input size.
 * Created by ©Ameya on 2/21/2018 at 1:05 AM.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] elements = {4, 2, 5, 88, -1, 7, 9};
        selectionSort(elements);
    }

    /**
     * Sorts the elements in such a way that any given point of time
     * ith element contains the ith smallest element of the array
     *
     * @param elements
     */
    private static void selectionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;
            System.out.println("Elements after " + (i + 1) + " pass");
            for (int k = 0; k < elements.length; k++) {
                System.out.println(elements[k]);
            }

        }
    }
}
