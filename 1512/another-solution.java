class Solution {
    public int numIdenticalPairs(int[] nums) {
        //O(N),O(N)
        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                result += map.get(nums[i]);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return result;    
    }
}