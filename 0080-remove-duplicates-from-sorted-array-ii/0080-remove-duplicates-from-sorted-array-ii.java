class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                if(map.get(i)<2){
                    map.put(i,map.get(i)+1);
                }
            }
            else{
                map.put(i,1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue()==2){
                ans.add(i.getKey());
                ans.add(i.getKey());
            }
            else
                ans.add(i.getKey());
        }
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            nums[i]=ans.get(i);
        }

        return ans.size();
    }
}