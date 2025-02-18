class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //O(N),O(1)
        //long because there a test case need a datatype bigger than int
        long temp=0;
        long result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                temp++;
                result+=temp;
            }
            else  {
                temp=0;
            }
        }
        return result;
    }
}