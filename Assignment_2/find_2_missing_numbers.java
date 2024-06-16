//So this question is basically the same as Single number 3 with some minor changes;
public class find_2_missing_numbers {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 6 }; // Example array with missing numbers 3 and 5
        int n = 6; // The maximum number in the full range
        int[] result = singleNumber(nums, n);
        System.out.println("The two missing numbers are: " + result[0] + " and " + result[1]);
    }

    public static int[] singleNumber(int[] nums, int n) {
         // Step 1: XOR all numbers from 1 to n
         int totalXOR = 0;
         for (int i = 1; i <= n; i++) {
             totalXOR ^= i;
         }
 
         // Step 2: XOR all numbers present in the array
         int arrayXOR = 0;
         for (int num : nums) {
             arrayXOR ^= num;
         }
 
         // Step 3: XOR of the two missing numbers
         int missingXOR = totalXOR ^ arrayXOR;
 
         // Step 4: Find the rightmost set bit in missingXOR
         int setBit = missingXOR & -missingXOR;
 
         // Initialize two variables to hold the two missing numbers
         int missing1 = 0, missing2 = 0;
 
         // Step 5: Partition numbers into two groups and XOR each group
         for (int i = 1; i <= n; i++) {
             if ((i & setBit) != 0) {
                 missing1 ^= i;
             } else {
                 missing2 ^= i;
             }
         }
 
         for (int num : nums) {
             if ((num & setBit) != 0) {
                 missing1 ^= num;
             } else {
                 missing2 ^= num;
             }
         }
 
         return new int[]{missing1, missing2};
    }
}
