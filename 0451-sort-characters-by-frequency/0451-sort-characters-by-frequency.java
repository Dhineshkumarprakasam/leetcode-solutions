class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char i : s.toCharArray())
            map.put(i,map.getOrDefault(i,0)+1);

        PriorityQueue<Character> q = new PriorityQueue<>((a,b)->map.get(b) - map.get(a));
        q.addAll(map.keySet());

        StringBuffer ans= new StringBuffer();

        while(!q.isEmpty()){
            char c = q.poll();
            for(int i=0;i<map.get(c);i++)
                ans.append(c);
        }

        return ans.toString();



    }
}