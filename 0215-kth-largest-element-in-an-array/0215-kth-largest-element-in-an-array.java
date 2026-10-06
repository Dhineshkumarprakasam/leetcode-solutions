class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i : nums){
            q.offer(i);
        }

        for(int i=0;i<nums.length-k;i++)
            q.poll();
        
        return q.poll();
    }
}