class Solution {
    public int findMaxLength(int[] nums) {
        
        int zero=0, one=0, res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                zero++;
            else
                one++;
            
            if(!map.containsKey(one-zero))
                map.put(one-zero,i);
                
            else
            {
                int idx = map.get(one-zero);
                res = Math.max(res,i-idx);
            }
                
        }
        return res;
    }
}