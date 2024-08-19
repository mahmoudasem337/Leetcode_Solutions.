class Solution {
    public int maxSubArray(int[] nums) {
        //Sliding Window
        //O(N),O(1)
        int maxSum = Integer.MIN_VALUE;;
        int currentSum = 0;

        for (int i=0;i<=nums.length-1;i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);//5,9,8,15,23
            maxSum = Math.max(maxSum, currentSum);//5,9,8,15,23
        }

        return maxSum;//23
    }
}