class Solution {

    public int possible(int arr[], int threshold, int divisor, int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=(int) Math.ceil((double) arr[i] / divisor);
        
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int l=1,h=nums[0];
        int ans=h;
        for(int i=0;i<n;i++)
            if(nums[i]>h) h=nums[i];

        while(l<=h)
        {
            int m = (l+h)/2;
            if(possible(nums,threshold,m,n)<=threshold)
            {
                ans=m;
                h=m-1;
            }
            else
                l=m+1;
        }

        return ans;
    }
}