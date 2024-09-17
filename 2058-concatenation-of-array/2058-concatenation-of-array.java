class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2*nums.length;
        int arr[]= new int[n];

        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++)
        {
            arr[j]=nums[i];
            j++;
        }
        return arr;
    }
}