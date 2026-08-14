class Solution {
    public int maxProduct(int[] nums) {
       int maxi=nums[0];
       int mini = nums[0];
       int ans = nums[0];

       for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxi;
                maxi = mini;
                mini = temp;
            }

            maxi = Math.max(nums[i],maxi*nums[i]);
            mini = Math.min(nums[i],mini*nums[i]);

            ans = Math.max(maxi,ans);
       }

       return ans;
    }
}