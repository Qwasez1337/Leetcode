import java.util.*;

class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums[nums.length - 1];
        if (nums.length != n + 1) return false;

        for (int i = 1; i < nums.length - 1; i++) {
            if(nums[i - 1] != i) return false;
        }

        return nums[nums.length - 1] == n && n == nums[nums.length - 2];

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isGood(new int[]{2,2,2}));
    }
}








