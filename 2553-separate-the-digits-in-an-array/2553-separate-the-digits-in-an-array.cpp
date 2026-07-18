class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            for(char j : to_string(nums[i]))
                ans.push_back(j-'0');
        }
        return ans;
    }
};