public class Min_number_of_Jumps {
    public static int minimum_jumps(int[] nums){
        if (nums.length <= 1) {
            return 0;
        }

        if (nums[0] == 0) {
            return -1;
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return currentEnd >= nums.length - 1 ? jumps : -1;
    }
}

