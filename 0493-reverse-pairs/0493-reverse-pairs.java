class Solution {
    static int count=0;

    public void merge(int arr[], int l, int m, int r)
    {
        int n1= m-l+1;
        int n2 = r-m;
        int L[]=new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++)
            L[i]=arr[l+i];
        
        for(int j=0;j<n2;j++)
            R[j]=arr[m+j+1];
        
        
        int idx=0;
        for(int i=0;i<n1;i++){
            while(idx<n2 && (long)L[i] > 2L * (long)R[idx])
                idx++;
            count+=idx;
        }
        

        int i=0,j=0,k=l;

        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            arr[k]=R[j];
            j++;
            k++;
        }

    }
    public void mergesort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public int reversePairs(int[] nums) {
        count=0;
        mergesort(nums,0,nums.length-1);
        return count;
    }
}