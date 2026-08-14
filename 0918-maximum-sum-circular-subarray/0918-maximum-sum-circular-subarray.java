class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int currMin=0, currMax=0,mini=nums[0],maxi=nums[0];

        for(int i=0;i<nums.length;i++){
            currMin = Math.min(nums[i],currMin+nums[i]);
            mini = Math.min(currMin,mini);

            currMax = Math.max(nums[i],currMax+nums[i]);
            maxi = Math.max(currMax,maxi);

            total+=nums[i];
        }

        if(maxi<0)
            return maxi;
            
        return Math.max(maxi,total-mini);
    }
}