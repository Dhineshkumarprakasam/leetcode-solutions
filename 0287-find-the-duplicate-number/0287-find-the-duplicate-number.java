class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i : nums)
        {
            if(ans.contains(i))
                return i;
            ans.add(i);
        }

        return -1;
    }
}