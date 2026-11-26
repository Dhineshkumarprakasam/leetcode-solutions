class Solution {
    public int maxProduct(int[] nums) {
        int minProduct=nums[0];
        int maxProduct=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }

            minProduct = Math.min(nums[i], nums[i]*minProduct);
            maxProduct = Math.max(nums[i], nums[i]*maxProduct);
            ans = Math.max(ans,maxProduct);
        }

        return ans;
    }
}