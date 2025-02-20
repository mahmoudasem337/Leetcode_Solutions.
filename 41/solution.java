class Solution {
    public int firstMissingPositive(int[] nums) {
        int result=1;
        Arrays.sort(nums); //(N Log N)
        for(int i=0; i< nums.length;i++)
        {
            if(nums[i]==0 || nums[i]<0)
            {
                continue;
            }
            if(nums[i]==result)
            {
                result++;
            }
        }
        return result;
    }
}