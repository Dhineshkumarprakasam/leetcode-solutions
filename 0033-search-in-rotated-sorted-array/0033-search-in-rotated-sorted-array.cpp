class Solution {
public:
    int search(vector<int>& nums, int target) {
        int i=find(nums.begin(),nums.end(),target)-nums.begin();
        if(i>=nums.size())
            return -1;
        else
            return i;
    }
};