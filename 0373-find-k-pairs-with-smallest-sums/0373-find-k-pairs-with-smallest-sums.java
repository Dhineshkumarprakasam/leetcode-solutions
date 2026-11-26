class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i=0;i<Math.min(k,nums1.length);i++){
            q.offer(new int[]{nums1[i]+nums2[0],i,0});
        }

        List<List<Integer>> result = new ArrayList<>();
        while(!q.isEmpty() && result.size()<k){
            int [] curr = q.poll();
            int i=curr[1];
            int j = curr[2];

            result.add(Arrays.asList(nums1[i],nums2[j]));
            if(j+1<nums2.length){
                q.offer(new int[]{nums1[i]+nums2[j+1],i,j+1});
            }
        }

        return result;

    }
}