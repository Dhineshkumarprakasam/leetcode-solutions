class Solution {

    int find_fact(int n, int r)
    {
        int result=1;
        for(int i=0;i<r;i++)
        {
            result=result*(n-i);
            result=result/(i+1);
        }

        return result;
    }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<=numRows;i++)
        {
            List<Integer> sub= new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                sub.add(find_fact(i-1,j-1));
            }
            ans.add(sub);
        }

        return ans;
    }
}