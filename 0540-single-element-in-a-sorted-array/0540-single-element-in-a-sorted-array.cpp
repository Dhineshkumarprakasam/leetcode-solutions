class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        
        int n=nums.size();

        if(n==1)
            return nums[0];
        int i=0;
        while(i<n)
        {
            if(nums[i]!=nums[i+1])
                return nums[i];
            i+=2;
        }
        
        return -1;
    }
};