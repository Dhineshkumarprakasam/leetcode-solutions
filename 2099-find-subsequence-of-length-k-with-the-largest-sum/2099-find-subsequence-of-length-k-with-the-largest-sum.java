class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int []> q = new PriorityQueue<>((a,b)->a[1]-b[1]);
        int n = nums.length;

        for(int i=0;i<n;i++){
            q.add(new int[]{i,nums[i]});
            if(q.size()>k)
                q.poll();
        }


        ArrayList<int[]> part = new ArrayList<>();
        part.addAll(q);

        part.sort((a,b)->Integer.compare(a[0],b[0]));

        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=part.get(i)[1];
        }

        return ans;
    }
}