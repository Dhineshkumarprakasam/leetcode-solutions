class Solution {
public:
    int findMin(vector<int>& nums) {
        
        int ans=INT_MAX;

        int l=0;
        int h=nums.size()-1;
        
        while(l<=h)
        {
            int mid = (l+h)/2;
            
            if(nums[l]<=nums[mid])
            {
                ans = min(nums[l],ans);
                l=mid+1;
            }

            else
            {
                h=mid-1;
                ans = min(ans,nums[mid]);
                
            }
        }
        return ans;
    }
    
};