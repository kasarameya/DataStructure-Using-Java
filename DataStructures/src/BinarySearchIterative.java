import java.util.Arrays;

/**
 * This program is used to search an element in a set of input elements using the Iterative method
 * We return the index of the element if it is present in the set, else we return -1
 * Created by ©Ameya on 2/21/2018 at 1:48 AM.
 */
public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] elements = {4, -2, 5, 88, -1, 7, 9};
        Arrays.sort(elements);
        System.out.println(bSearch(elements, 88));
    }

    /**
     * PRECONDITION :- Elements have to be in sorted order
     * This method performs the actual searching of the element in the given set of data
     *
     * @param elements to be searched in
     * @param key      value to be searched for
     * @return ndex of the found element of -1 if element is not found
     */
    private static int bSearch(int[] elements, int key) {
        int left = 0, right = elements.length - 1, mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;

            if (key < elements[mid]) {
                right = mid - 1;
            } else if (key == elements[mid]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
