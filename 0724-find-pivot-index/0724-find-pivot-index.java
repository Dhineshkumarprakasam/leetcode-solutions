class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        left[0]=nums[0];

        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i];
        }

        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i];
        }

        for(int j=0;j<n;j++){
            if(left[j]==right[j])
                return j;
        }

        return -1;
    }
}