class Solution {
    public boolean increasingTriplet(int[] nums) {
        //O(N),O(1)
        //keep the smallest 2 and when youd find the biggest return true
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}