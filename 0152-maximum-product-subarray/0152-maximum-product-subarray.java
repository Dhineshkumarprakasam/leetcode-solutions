class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int maxprod = nums[0];
        int minprod = nums[0];

        for(int i=1;i<nums.length;i++){
            int current = nums[i];
            if(current<0){
                int temp = maxprod;
                maxprod = minprod;
                minprod=temp;
            }
            maxprod=Math.max(nums[i],maxprod*current);
            minprod = Math.min(nums[i],minprod*current);
            ans = Math.max(ans,maxprod);
        }

        return ans;
    }
}