class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        if(nums.length==0)
            return 0;
        int maxlen=1;
        int len=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
                len++;
            else
            {
                len=1;
            }
            maxlen=Math.max(maxlen,len);
        }

        return maxlen;
    }
}