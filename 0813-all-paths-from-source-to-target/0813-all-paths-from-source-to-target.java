class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

    public void findpath(int src, int dest, List<Integer> path)
         {
            path.add(src);

            if(src==dest)
                ans.add(new ArrayList(path));
            
            else if(map.containsKey(src))
            {
                for(int i : map.get(src))
                    findpath(i,dest,path);
            }

            path.remove(path.size()-1);
         } 
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
                if(!map.containsKey(i))
                    map.put(i,new ArrayList());
                
                map.get(i).add(graph[i][j]);
            }
        } 

         findpath(0,graph.length-1,new ArrayList());

       

        return ans;
        
    }
}