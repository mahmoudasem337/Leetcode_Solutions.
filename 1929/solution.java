class Solution {
    public int[] getConcatenation(int[] nums) {
        //O(N),O(N)
/*int[] nums2 = new int[2*nums.length];
int start=0;
int nums1end = nums.length-1;
int nums2end = nums2.length-1;
while(start<=nums2end){
nums2[start]=nums[start];
nums2[nums2end]=nums[nums1end];
start++;
nums2end--;
nums1end--;
}
*/
//O(N),O(N)
        int n=nums.length;
        int []nums2 = new int[n*2];
        for(int i=0;i<n;i++){
            nums2[i]=nums[i];
            nums2[i+n]=nums[i];
        }
        return nums2;
    }
}



