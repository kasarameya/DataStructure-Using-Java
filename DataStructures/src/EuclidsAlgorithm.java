/**
 * The Euclids Algorithm is used to find the Greatest Common Divisor of the given 2 numbers
 * Created by ©Ameya on 2/20/2018 at 11:38 PM.
 */
public class EuclidsAlgorithm {
    public static void main(String[] args) {
        System.out.println(findGCD(1200, 6));
    }

    /**
     * This method calculates the GCD for the given 2 input numbers, if the remainder is not equal to zero
     * then the largerNumber is set equal to the smaller number and the smaller number is set equal to the remainder.
     * The function returns the value when remainder is equal to zero
     *
     * @param largerNumber  of the input
     * @param smallerNumber of the input
     * @return GCD of the @largerNumber and @smallerNumber
     */
    private static int findGCD(int largerNumber, int smallerNumber) {
        if (smallerNumber > largerNumber) {
            return -1;
        } else {
            int remainder = -1;
            while (remainder != 0) {
                remainder = largerNumber % smallerNumber;
                largerNumber = smallerNumber;
                smallerNumber = remainder;
            }
            return largerNumber;
        }
    }
}
