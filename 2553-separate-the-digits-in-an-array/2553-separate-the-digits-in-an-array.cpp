class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            int ele = nums[i];
            
            vector<int> temp;
            while(ele>0){
                temp.push_back(ele%10);
                ele=ele/10;
            }
            reverse(temp.begin(),temp.end());
            ans.insert(ans.end(),temp.begin(),temp.end());
        }
        return ans;
    }
};