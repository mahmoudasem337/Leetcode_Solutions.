class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> x =new HashSet<Integer>();
        for(int i=0;i<nums.length;++i)
            x.add(nums[i]);

        if(x.size()<nums.length)
            return true;
        else
            return false;
    }
}