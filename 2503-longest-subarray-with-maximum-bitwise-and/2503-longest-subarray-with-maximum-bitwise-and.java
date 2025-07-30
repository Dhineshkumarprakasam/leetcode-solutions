class Solution {
    public int longestSubarray(int[] nums) {
        
        int curr_len=0,max_len=0;
        int max=nums[0];

        for(int i=1;i<nums.length;i++)
            if(nums[i]>max)
                max=nums[i];
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==max)
            {
                curr_len++;
                max_len = Math.max(max_len,curr_len);
            }
            else
                curr_len=0;
        }

        return max_len;
    }
}