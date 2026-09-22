class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder ans = new StringBuilder();

        for(int i=k-1;i>=0;i--)
            ans.append(s.charAt(i));

        for(int i=k;i<s.length();i++)
            ans.append(s.charAt(i));

        return ans.toString();
    }

}