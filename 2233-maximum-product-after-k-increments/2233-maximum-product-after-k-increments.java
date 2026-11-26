class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int mod = 1_000_000_007;
        int n=nums.length;
        for(int i=0;i<n;i++){
            q.offer(nums[i]);
        }

        for(int i=0;i<k;i++){
            q.offer((q.poll()+1));
        }

        long maxProduct=1;
        for(int i=0;i<n;i++)
            maxProduct = (maxProduct * q.poll()) % mod;
        
        return (int)maxProduct;
    }
}