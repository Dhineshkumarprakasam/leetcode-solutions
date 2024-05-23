class Solution {
public:
    int majorityElement(vector<int>& nums) {
        for(int i=0;i<nums.size();i++)
        {
            if(count(nums.begin(),nums.end(),nums[i])>(nums.size()/2))
                return nums[i];
        }
        return -1;
    }
};