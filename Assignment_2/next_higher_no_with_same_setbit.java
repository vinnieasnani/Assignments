public class next_higher_no_with_same_setbit {
    public static void main(String[] args) {
        int n = 156;
        System.out.println("Next higher number with same" + "number of set bits is " + func(n));
    }

    private static int func(int n) {
        // Step 1: Identify the rightmost 0 bit that has a 1 bit to its right
        // and flip it to 1. This creates the smallest increment.
        int c = n;
        int c0 = 0; // Count of trailing zeros
        int c1 = 0; // Count of ones to the right of the rightmost 0

        // Count trailing zeros (c0)
        while ((c & 1) == 0 && c != 0) {
            c0++;
            c >>= 1;
        }

        // Count ones (c1)
        while ((c & 1) == 1) {
            c1++;
            c >>= 1;
        }

        // If there is no such number, return -1
        if (c0 + c1 == 31 || c0 + c1 == 0) {
            return -1;
        }

        // Position of rightmost non-trailing zero (rightmost 0 with 1s to its right)
        int p = c0 + c1;

        // Step 2: Flip the rightmost non-trailing zero
        n |= (1 << p);

        // Step 3: Clear all bits to the right of p
        n &= ~((1 << p) - 1);

        // Step 4: Insert (c1-1) ones on the right
        n |= (1 << (c1 - 1)) - 1;

        return n;
    }
}
