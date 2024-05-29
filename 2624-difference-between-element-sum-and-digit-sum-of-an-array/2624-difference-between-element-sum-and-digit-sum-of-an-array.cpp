class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int a=accumulate(nums.begin(),nums.end(),0);
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            int val=nums[i];
            while(val>0)
            {
                sum=sum+val%10;
                val=val/10;
            }
        }
        return abs(a-sum);
    }
};