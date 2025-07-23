class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();

        for(int i : nums)
            count.put(i,count.getOrDefault(i,0)+1);
        
        for(var i : count.entrySet())
            if(i.getValue()==1)
                return i.getKey();
        
        return 0;
    }
}