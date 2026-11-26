class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        int n = nums.length;

        for(int i=0;i<n;i++){
            q.offer(nums[i]);
        }

        for(int i=0;i<k-1;i++)
            q.poll();
        
        return q.poll();
    }
}