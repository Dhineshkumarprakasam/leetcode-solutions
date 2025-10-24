class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i[] : edges){
            map.put(i[0],map.getOrDefault(i[0],0)+1);
            map.put(i[1],map.getOrDefault(i[1],0)+1);
        }

        int maxKey=Integer.MIN_VALUE;
        int maxValue=Integer.MIN_VALUE;

        for(var i : map.entrySet()){
            if(i.getValue()>maxValue){
                maxValue=i.getValue();
                maxKey=i.getKey();
            }
        }

        return maxKey;
    }
}