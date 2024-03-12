class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for(int number : nums){
            heap.add(number);
            if(heap.size() > k)
                heap.poll();
        }
        return heap.peek();
    }
}