import java.util.ArrayList;
import java.util.List;

public class power_set {
    public static void main(String[] args) {
        String str = "abc"; // Example input
        List<String> result = func(str);

        // Print the power set
        System.out.println("Power Set:");
        for (String subset : result) {
            System.out.println(subset);
        }
    }

    private static List<String> func(String str) {
        List<String> ans = new ArrayList<>();

        // Total number of subsets for a string of length n is 2^n
        int total = 1 << str.length(); // 2^n using bitwise left shift

        // Iterate over each possible subset
        for (int i = 0; i < total; i++) {
            StringBuilder subset = new StringBuilder();

            // Check each bit of the integer i
            for (int j = 0; j < str.length(); j++) {
                // If the j-th bit of i is set, include str.charAt(j) in the subset
                if ((i & (1 << j)) != 0) {
                    subset.append(str.charAt(j));
                }
            }

            // Add the generated subset to the power set
            ans.add(subset.toString());
        }

        return ans;
    }
}
