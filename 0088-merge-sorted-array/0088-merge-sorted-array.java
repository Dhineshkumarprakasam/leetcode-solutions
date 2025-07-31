class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int arr[] = new int[m+n];

        int l=0;
        int r=0;
        int idx=0;
        while(l<m && r<n)
        {
            if(nums1[l]<=nums2[r])
            {
                arr[idx]=nums1[l];
                l++;
            }
            else{
                arr[idx]=nums2[r];
                r++;
            }
            idx++;
        }

        while(l<m)
        {
            arr[idx]=nums1[l];
            l++;
            idx++;
        }
        while(r<n)
        {
            arr[idx]=nums2[r];
            r++;
            idx++;
        }
        
        for(int i=0;i<(m+n);i++)
            nums1[i]=arr[i];
        
    }
}