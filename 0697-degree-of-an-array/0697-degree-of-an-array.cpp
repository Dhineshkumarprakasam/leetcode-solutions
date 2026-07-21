class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        map<int,pair<int,vector<int>>> m;
        for(int i =0;i<nums.size();i++){
            if(m.find(nums[i])==m.end()){
                 pair<int,vector<int>> temp;
                temp.first = 0;
                temp.second.push_back(i);
                m[nums[i]]=temp;
            }
            else{
                m[nums[i]].first++;
                m[nums[i]].second.push_back(i);
            }
        }

        int mini=1e9;
        int maxi=0;
        for(auto i : m){
            if(i.second.first>maxi){
                maxi = i.second.first;
                mini = i.second.second[i.second.second.size()-1]-i.second.second[0]+1;
            }
            else if(i.second.first==maxi)
                mini = min(mini,i.second.second[i.second.second.size()-1]-i.second.second[0]+1);
        }
        return mini;

    }
};