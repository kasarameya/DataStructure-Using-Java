/**
 * This program is used to search an element in a set of input elements.
 * We return the index of the element if it is present in the set, else we return -1
 * Created by ©Ameya on 2/21/2018 at 1:33 AM.
 */
public class BinarySearchDnC {
    public static void main(String[] args) {
        int[] elements = {4, 2, 5, 88, -1, 7, 9};
        bSearch(elements, 55);
    }

    /**
     * This method calls a helper function which performs the actual searching.
     * Here we find the parameters like p and r that can be passed to the @bSearchHelper
     *
     * @param elements to be searched in
     * @param key      value to be searched for
     */
    private static void bSearch(int[] elements, int key) {
        int p = 0, r = elements.length - 1;
        System.out.println(bSearchHelper(elements, p, r, key));
    }

    /**
     * This method performs the actual searching of the element in the given set of data
     *
     * @param elements to be searched for
     * @param p        start position of the recursive array
     * @param r        last position of the recursive array
     * @param key      to be searched for in the array
     * @return index of the found element of -1 if element is not found
     */
    private static int bSearchHelper(int[] elements, int p, int r, int key) {
        if (p <= r) {
            int q = (p + r) / 2;
            if (key < elements[q]) {
                return bSearchHelper(elements, p, q - 1, key);
            } else if (key == elements[q]) {
                return q;
            } else {
                return bSearchHelper(elements, q + 1, r, key);
            }

        } else {
            return -1;
        }
    }
}
