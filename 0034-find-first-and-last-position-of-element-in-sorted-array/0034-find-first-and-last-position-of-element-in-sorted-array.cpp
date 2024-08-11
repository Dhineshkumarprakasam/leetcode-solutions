class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans = {-1,-1};

        //first index
        int l=0;
        int h=nums.size()-1;
        while(l<=h)
        {
            
            int mid=(l+h)/2;

            if(nums[mid]==target)
            {
                ans[0]=mid;
                h=mid-1;
            }

            else if(nums[mid]>target)
            {
                h=mid-1;
            }

            else
            {
                l=mid+1;
            }
        }

        //last index
        l=0;
        h=nums.size()-1;
        while(l<=h)
        {
            
            int mid=(l+h)/2;

            if(nums[mid]==target)
            {
                ans[1]=mid;
                l=mid+1;
            }

            else if(nums[mid]>target)
            {
                h=mid-1;
            }

            else
            {
                l=mid+1;
            }
        }


        return ans;  
    }
};