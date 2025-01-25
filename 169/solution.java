class Solution {
    public int majorityElement(int[] nums) {
        //O(N^2),O(1)
        /*for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    temp++;}
            }
            if(temp>(nums.length/2))
                return nums[i];
        }
        return -1;
        */
        //---------------------------------------------------------------------------------------------
        //O(nlogn),O(1)
        //this solution is work good as in problem def. we assumed that the maj. element is exits in the array
        //because the maj. element is appear more than n/2, so it's should appear in the middle of the array.
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}