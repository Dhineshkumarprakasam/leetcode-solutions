class Solution {
    public int largestAltitude(int[] gain) {
        
        int pre=0,max=0;

        for(int i=0;i<gain.length;i++)
        {
            pre+=gain[i];
            max=Math.max(pre,max);
        }

        return max;

    }
}