class Solution {
    public int findDuplicate(int[] nums) {
        //O(N),O(1)
        //There's more than one solution for this problem like 2Loops,Set,Sorting
        for(int i=0; i<nums.length; i++){
            int j=Math.abs(nums[i]);
            if(nums[j]<0){
                return j;
            }
            nums[j]=-nums[j];
        }
        return -1;
    }
}
    