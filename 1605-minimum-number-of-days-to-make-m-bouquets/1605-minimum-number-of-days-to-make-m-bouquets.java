class Solution {
    public boolean possible(int arr[], int day,int m, int k)
    {
        int cnt=0;
        int noOfB=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
                cnt++;
            else
            {
                noOfB+=(cnt/k);
                cnt=0;
            }
        }

        noOfB+=(cnt/k);
        return noOfB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)
            return -1;
        
        int l=bloomDay[0],r=bloomDay[0];
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<l)
                l=bloomDay[i];
            if(bloomDay[i]>r)
                r=bloomDay[i];
        }

        while(l<=r)
        {
            int mid=(l+r)/2;
            if(possible(bloomDay,mid,m,k))
            {
                r=mid-1;
            }
            else
                l=mid+1;
        }

        return l;
    }
}