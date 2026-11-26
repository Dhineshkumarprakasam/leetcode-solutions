class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(int i=0;i<nums.length;i++){
            q.offer(new int[]{i,nums[i]});
            if(q.size()>k)
                q.poll();
        }

        ArrayList<int[]> part = new ArrayList<>();
        part.addAll(q);

        part.sort((a,b)->a[0]-b[0]);
        
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=part.get(i)[1];
        }

        return ans;
    }
}