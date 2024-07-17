class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int pi=0;
        int ni=1;

        vector<int> ans(nums.size(),0);

        for(int i:nums)
        {
            if(i<0)
            {
                ans[ni]=i;
                ni+=2;
            }
            else
            {
                ans[pi]=i;
                pi+=2;
            }
        }
        return ans;
    }
};