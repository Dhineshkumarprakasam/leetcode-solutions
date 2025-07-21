class Solution {
    public int minStartValue(int[] nums) {
        
        int sum=0;
        int mini=0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            mini = Math.min(sum,mini);
        }

        return Math.max(1-mini,1);
    }
}