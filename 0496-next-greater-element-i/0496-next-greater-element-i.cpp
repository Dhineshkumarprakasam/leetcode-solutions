class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;

        for(int i : nums1){
            auto it = find(nums2.begin(),nums2.end(),i);
            if(it!=nums2.end()){
                int idx = it - nums2.begin();
                int found=0;
                for(int j=idx;j<nums2.size();j++){
                    if(nums2[j]>i){
                        ans.push_back(nums2[j]);
                        found=1;
                        break;
                    }
                }
                if(found==0)
                    ans.push_back(-1);
            }
        }

        return ans;
    }
};