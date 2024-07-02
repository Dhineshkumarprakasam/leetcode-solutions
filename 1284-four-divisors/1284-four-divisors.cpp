class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        long long value=0;
        for(int i=0;i<nums.size();i++)
        {
            vector<long long int> divisors;
            for(int j=1;j<(int)pow(nums[i],0.5)+1;j++)
            {
                if(nums[i]%j==0)
                {
                    if (j != nums[i] / j) {
                        divisors.push_back(nums[i] / j);
                    }
                    divisors.push_back(j);
                }

                if(divisors.size()>4)
                    break;
            }
            if(divisors.size()==4)
                value=value+accumulate(divisors.begin(),divisors.end(), 0);

        }
        return value;
    }
};