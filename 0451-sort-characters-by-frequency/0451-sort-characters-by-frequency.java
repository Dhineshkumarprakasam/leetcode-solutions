class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : s.toCharArray())
            map.put(i,map.getOrDefault(i,0)+1);
        

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());

        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.poll();
            for(int j=0;j<map.get(c);j++){
                ans.append(c);
            }
        }

        return ans.toString();
    }
}