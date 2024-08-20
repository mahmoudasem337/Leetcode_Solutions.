class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Prefix , Postfix
        int[] arr = new int[nums.length];
        int temp=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=temp;
            temp=temp*nums[i];
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*temp;
            temp=temp*nums[i];
        }
        return arr;
    }
}