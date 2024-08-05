class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int,int> hash;
        hash[0]=1;

        int pre=0;
        int cnt=0;

        for(int i=0;i<nums.size();i++)
        {
            pre+=nums[i];
            cnt+=hash[pre-k];

            hash[pre]+=1;
        }
        return cnt;
    }
};