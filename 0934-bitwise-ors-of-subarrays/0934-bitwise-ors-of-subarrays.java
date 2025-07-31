class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        
        HashSet<Integer> previous = new HashSet<>();
        HashSet<Integer> current = new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
            HashSet<Integer> mid = new HashSet<>();
            mid.add(arr[i]);
            for(int j : current)
                mid.add((arr[i]|j));
                
            current = mid;
            previous.addAll(current);
        }
        return previous.size();
    }
}