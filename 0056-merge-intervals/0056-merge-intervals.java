class Solution {
    public int[][] merge(int[][] arr) {
        
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i][0]>arr[j][0] || ((arr[i][0]==arr[j][0]) && arr[i][1] > arr[j][1]))
                {
                    int temp[] = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        int ans[][] = new int[arr.length][2];
        int curr=0;
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]<=ans[curr][1])
                ans[curr][1] = Math.max(ans[curr][1], arr[i][1]);
              
            else{
                curr++;
                ans[curr]=arr[i];
            }
        }


        int final_ans[][] = new int[curr+1][2];
        for(int i=0;i<=curr;i++)
            final_ans[i]=ans[i];

        return final_ans;
    }
}