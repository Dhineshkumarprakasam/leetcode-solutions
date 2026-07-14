class Solution {
public:
    int find(int a, int b){
        if(b==0)
            return a;
        
        return find(b,a%b);
    }

    int findGCD(vector<int>& nums) {
        int maxi=nums[0];
        int mini=nums[0];

        for(int i : nums){
            maxi=max(maxi,i);
            mini=min(mini,i);
        }

        return find(maxi,mini);

    }
};