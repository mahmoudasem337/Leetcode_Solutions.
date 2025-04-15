class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //O(N),O(N)
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i- map.get(nums[i]) <= k)
                return true;
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}