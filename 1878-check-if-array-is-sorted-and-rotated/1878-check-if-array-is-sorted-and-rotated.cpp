class Solution {
public:
    bool check(vector<int>& nums) {
        
        int yes=0;
        if(nums.size()==1 || nums.size()==2)
        {
            return true;
        }
        for(int i=0;i<nums.size();i++)
        {
            int j=i;
            while((j+1)%nums.size()!=i)
            {
                if(nums[j]>nums[(j+1)%nums.size()])
                {
                    yes=0;
                    break;
                }
                   
                else
                {
                    yes=1;
                }
                j=(j+1)%nums.size();
            }

            if(yes==1)
            {
                return true;
            }
        }
        return false;
    }
};