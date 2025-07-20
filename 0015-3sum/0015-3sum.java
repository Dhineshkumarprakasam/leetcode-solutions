class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < len; j++) {
                int third = -(nums[i] + nums[j]);
                if (set.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    ans.add(temp);
                }
                set.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}
