class Solution {
    public int countBinarySubstrings(String s) {
        ArrayList<Integer> groups = new ArrayList<>();

        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) == s.charAt(i))
                count++;
            else{
                groups.add(count);
                count=1;
            }
        }
        groups.add(count);

        int ans=0;
        for(int i=1;i<groups.size();i++){
            ans+=Math.min(groups.get(i-1),groups.get(i));
        }

        return ans;
    }
}