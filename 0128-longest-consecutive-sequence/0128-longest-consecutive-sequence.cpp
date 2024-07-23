class Solution {
public:
    int longestConsecutive(vector<int>& arr) {
       sort(arr.begin(),arr.end());
       int longest=1;
       int count=0;
       int lastSmaller=INT_MIN;
       if(arr.size()==0)
            return 0;
       for(int i=0;i<arr.size();i++)
       {
            if(arr[i]-1==lastSmaller)
            {
                count++;
                lastSmaller=arr[i];
            }
            else if(arr[i]!=lastSmaller)
            {
                count=1;
                lastSmaller=arr[i];
            }
            longest=max(longest,count);
       }
       return longest;
    }
};