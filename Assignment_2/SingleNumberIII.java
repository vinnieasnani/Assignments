public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 5 };
        int[] result = singleNumber(nums);
        System.out.println("The two unique numbers are: " + result[0] + " and " + result[1]);
    }

    public static int[] singleNumber(int[] nums) {
        // Step 1: XOR all numbers to get the XOR of the two unique numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find a set bit (rightmost set bit) in the XOR result
        // This will be used to partition the numbers into two groups
        // The expression (xor & -xor) isolates the rightmost set bit
        int setBit = xor & -xor;

        // Step 3: Initialize two variables to hold the two unique numbers
        int num1 = 0, num2 = 0;

        // Step 4: Partition the numbers into two groups and XOR them separately
        for (int num : nums) {
            if ((num & setBit) == 0) {
                num1 ^= num; // XOR numbers in the first group
            } else {
                num2 ^= num; // XOR numbers in the second group
            }
        }

        // num1 and num2 are the two unique numbers
        return new int[] { num1, num2 };
    }
}
