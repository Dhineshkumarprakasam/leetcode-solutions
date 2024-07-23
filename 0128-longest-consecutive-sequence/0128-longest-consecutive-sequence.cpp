class Solution {
public:
    int longestConsecutive(vector<int>& arr) {
        int n=arr.size();
        if(n==0) return 0;
        unordered_set<int> st;

        for(int i=0;i<n;i++)
            st.insert(arr[i]);
        
        int longest=1;
    
        for(auto i:st)
        {
            if(st.find(i-1)==st.end())
            {
                int cnt=1;
                int x=i;
                while(st.find(x+1)!=st.end())
                {
                    x++;
                    cnt++;
                }

                longest=max(longest,cnt);
            }
        }
        return longest;
    }
};