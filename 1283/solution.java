class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=0;
        int right=Arrays.stream(nums).max().getAsInt();
        while(left<=right){
            int mid=left+(right-left)/2;
            if(sum(nums,mid)<=threshold){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public int sum(int[]nums,int div){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += Math.ceil((double)nums[i]/(double)div);
        }
        return sum;
    }
}