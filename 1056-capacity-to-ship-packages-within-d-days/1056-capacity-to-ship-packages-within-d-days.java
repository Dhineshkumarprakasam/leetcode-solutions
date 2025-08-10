class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=weights[0];
        int h=0;

        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]>l)
                l=weights[i];
            h+=weights[i];
        }

        int ans=h;

        while(l<=h)
        {
            int m = (l+h)/2; //cpacity

            //check possiblility
            int possibleDays=1;
            int currWeight=0;
            
            for(int i=0;i<weights.length;i++)
            {
                if(currWeight+weights[i]<=m)
                    currWeight+=weights[i];
                else
                {
                    possibleDays++;
                    currWeight=weights[i];
                }
            }

            if(possibleDays>days)
                l=m+1;
            else
            {
                ans=m;
                h=m-1;
            }
        }

        return ans;
    }
}