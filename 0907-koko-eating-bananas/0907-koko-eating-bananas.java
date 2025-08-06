class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l=1;
        int r=piles[0];
        for(int i=0;i<piles.length;i++)
            if(r<piles[i])
                r=piles[i];


        while(l<r)
        {
            int m = (l+r)/2;
            int k=0; 
            System.out.println(m); 

            for(int i=0;i<piles.length;i++)
            {
                k+=(int)(Math.ceil((double)piles[i]/m));
            }
           
            if(k>h)
                l=m+1;
            else
                r=m; 
 
        }
        
        return l;
    }
}