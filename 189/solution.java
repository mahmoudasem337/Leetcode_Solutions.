class Solution {
    public void rotate(int[] nums, int k) {
        //With Extra Memory
        //O(N),O(N)
        int length = nums.length;
        int[] rotated = new int[length];
        int x=0;
        k = k % length;
        for(int i = length-k ; i<length ; i++){
            rotated[x++] = nums[i];
        }
        for(int i = 0 ; i<length-k ; i++){
            rotated[x++] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = rotated[i];
        }
    }
}