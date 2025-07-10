class Solution {
    public int maximizeGreatness(int[] arr) {
        Arrays.sort(arr);

        int i=0,j=0,count=0;
        int n = arr.length;
         while (i < n && j < n) {
            if (arr[j] > arr[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}