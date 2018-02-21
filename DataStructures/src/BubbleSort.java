/**
 * This algorithm sorts the given array of elements in their ascending order
 * Time complexity is O(n^2) and hence this algorithm should only be used for small
 * input size
 * Created by ©Ameya on 2/20/2018 at 11:52 PM.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] elements = {4, 2, 5, 88, -1, 7, 9};
        bubbleSort(elements);
    }

    /**
     * This method bubbles out the smallest element to the front of the array
     * after every pass
     *
     * @param elements
     */
    private static void bubbleSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = elements.length; j > i + 1; j--) {
                if (elements[j - 1] < elements[j - 2]) {
                    int temp = elements[j - 1];
                    elements[j - 1] = elements[j - 2];
                    elements[j - 2] = temp;
                }
            }
            System.out.println("Elements after " + (i + 1) + " pass");
            for (int k = 0; k < elements.length; k++) {
                System.out.println(elements[k]);
            }
        }
    }
}
