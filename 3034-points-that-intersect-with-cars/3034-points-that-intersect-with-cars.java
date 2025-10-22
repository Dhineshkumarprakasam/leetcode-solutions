class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int n=100;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=0;
        
        for(int i=0;i<nums.size();i++)
            for(int j=nums.get(i).get(0)-1;j<=nums.get(i).get(1)-1;j++)
                arr[j]++;
        
        int count=0;
        for(int i=0;i<n;i++)
            if(arr[i]>=1)
                count++;
        return count;

    }
}