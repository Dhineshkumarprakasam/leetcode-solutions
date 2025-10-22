class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int n = 2050-1950+1;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }

        for(int i=0;i<logs.length;i++){
            for(int j=(logs[i][0]-1950);j<(logs[i][1]-1950);j++)
                arr[j]++;
        }

        int max=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>arr[max])
                max=i;
        return 1950+max;
        
    }
}