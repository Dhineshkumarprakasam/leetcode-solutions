class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            maxsum=Math.max(nums[i],maxsum+nums[i]);
            ans = Math.max(ans,maxsum);
        }

        return ans;
    }
}