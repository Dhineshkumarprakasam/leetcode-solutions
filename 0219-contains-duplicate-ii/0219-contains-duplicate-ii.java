class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> items = new HashSet<>();

        if(k<=0) return false;

        for(int i=0;i<Math.min(k,nums.length);i++)
        {
            if(items.contains(nums[i]))
                return true;
            items.add(nums[i]);
        }

        int startIndex=0;
        int endIndex = k;

        while(endIndex<nums.length)
        {
            if(items.contains(nums[endIndex]))
                return true;
                
            items.remove(nums[startIndex]);
            startIndex++;

            items.add(nums[endIndex]);
            endIndex++;
        }

        return false;
    }
}