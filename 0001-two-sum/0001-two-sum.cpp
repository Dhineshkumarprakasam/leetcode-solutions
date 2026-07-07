class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> m;
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            int val = target-nums[i];
            if (m.count(val)>0){
                ans.push_back(i);
                ans.push_back(m[val]);
            }else{
                m[nums[i]]=i;
            }
        }
        return ans;
    }
};