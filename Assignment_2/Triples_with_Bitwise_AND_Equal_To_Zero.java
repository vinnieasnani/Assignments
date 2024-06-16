import java.util.HashMap;
import java.util.Map;

public class Triples_with_Bitwise_AND_Equal_To_Zero {
    public static void main(String[] args) {
        int[] a = { 2, 1, 3 }; // Example input
        int result = count(a);
        System.out.println("Number of triples with bitwise AND equal to zero: " + result);
    }

    public static int count(int[] a) {
        int n = a.length;
        int result = 0;

        // Map to store frequency of pairs (a[i] & a[j])
        Map<Integer, Integer> pairCount = new HashMap<>();

        // Step 1: Calculate the frequency of all (a[i] & a[j]) results
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int andResult = a[i] & a[j];
                pairCount.put(andResult, pairCount.getOrDefault(andResult, 0) + 1);
            }
        }

        // Step 2: For each element in the array, calculate (a[k] & pairResult)
        // and check if it equals 0. If it does, add the frequency of that pair to the
        // result.
        for (int k = 0; k < n; k++) {
            for (int key : pairCount.keySet()) {
                if ((a[k] & key) == 0) {
                    result += pairCount.get(key);
                }
            }
        }

        return result;
    }
}
