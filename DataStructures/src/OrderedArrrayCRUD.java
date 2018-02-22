import java.util.Scanner;

/**
 * This class performs the Insert, Read, Update and Delete operations on an ordered array
 * Created by ©Ameya on 2/21/2018 at 11:07 PM.
 */
public class OrderedArrrayCRUD {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        // Create an array of fixed size
        int[] elements = new int[5];
        // Initialize the array with Max Values so that insertion and deletion is possible
        for (int i = 0; i < elements.length; i++) {
            elements[i] = Integer.MAX_VALUE;
        }
        // User based actions dialog initiated
        do {
            System.out.println("What operation due you want to perform : \n1. Insert \n 2. Delete \n 3. Search \n 4. View \n Enter your Choice = ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    insertElement(elements);
                    break;
                case 2:
                    deleteElement(elements);
                    break;

                case 3:
                    searchElement(elements);
                    break;

                case 4:
                    viewAll(elements);
                    break;
            }

        } while (choice < 5);
    }

    /**
     * Displays the list of all the elements in the array
     *
     * @param elements to be displayed
     */
    private static void viewAll(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            System.out.println(elements[i]);
        }
    }

    /**
     * Searches for a given element in Array, returns -1 if not found
     *
     * @param elements to be searched in for
     */
    private static void searchElement(int[] elements) {
        System.out.println("Enter the element to be searched = ");
        int key = scanner.nextInt();
        System.out.println(binarySearch(elements, key));
    }

    /**
     * Iterative Binary search
     *
     * @param elements to be searched in
     * @param key      to be searched
     * @return index to be returned of the element
     */
    private static int binarySearch(int[] elements, int key) {
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

    /**
     * Deletes the given element by rotating the elements of the array to ensure order
     *
     * @param elements to be deleted
     */
    private static void deleteElement(int[] elements) {
        System.out.println("Enter the element to be deleted = ");
        int deleteValue = scanner.nextInt();
        int deleteIndex = binarySearch(elements, deleteValue);
        if (deleteIndex == -1) {
            System.out.println("Element is absent");
        } else {
            for (int i = deleteIndex; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[elements.length - 1] = Integer.MAX_VALUE;
        }
    }

    /**
     * Inserts the element in the array such that the array is always in sorted order
     *
     * @param elements whether the element neeeds to be inserted
     */
    private static void insertElement(int[] elements) {
        System.out.println("Enter the element to be inserted = ");
        int newItem = scanner.nextInt();

        int j = elements.length - 2;
        while (j >= 0 && elements[j] > newItem) {
            elements[j + 1] = elements[j];
            j--;

            elements[j + 1] = newItem;
            System.out.println("Element inserted at " + (j + 1) + " position");
        }

    }


}
