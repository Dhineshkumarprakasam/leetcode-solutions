class Solution {
public:
    int countit(vector<string>& arr, string element)
    {
        int c=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr[i]==element)
                c++;
        }
        return c;
    }
    string kthDistinct(vector<string>& arr, int k) {

        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            if(countit(arr,arr[i])==1)
            {
                if(count==k-1)
                {
                    return arr[i];
                }
                count++;
            }
        }
        return "";
    }
};