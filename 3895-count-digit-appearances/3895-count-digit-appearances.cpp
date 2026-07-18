class Solution {
public:
    int countDigitOccurrences(vector<int>& nums, int digit) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            int ele = nums[i];
            while(ele>0){
                if(ele%10==digit)
                    count++;
                ele=ele/10;
            }
        }
        return count;
    }
};