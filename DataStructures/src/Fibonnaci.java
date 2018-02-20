/**
 * Implementation of Fibonnaci Series using recursion
 * Created by Ameya on 2/19/2018 at 10:56 PM.
 */
public class Fibonnaci {

    public static void main(String[] args) {
        System.out.println(findFibonnaci(5));

    }

    /**
     * This method calculates the Fibonnaci of the input number
     *
     * @param number The number whose Fibonnaci is needed
     * @return Fibonacci of the passed input parameter
     */
    private static int findFibonnaci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return findFibonnaci(number - 1) + findFibonnaci(number - 2);
        }
    }
}
