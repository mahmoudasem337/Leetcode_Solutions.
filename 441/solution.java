class Solution {
    public int arrangeCoins(int n) {
        int left=0;
        int right=n;
        int answer=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(possible(n,mid)){
                left=mid+1;
                answer=mid;
            }
            else{
                right=mid-1;
            }
        }
        return answer;
    }
    public boolean possible (int n, long rows){
        long sum= (rows*(rows+1))/2;
        return n>=sum;
    }
}