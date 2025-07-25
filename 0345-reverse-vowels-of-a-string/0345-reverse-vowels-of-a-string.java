class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder vow = new StringBuilder();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o','u','A','E','I','O','U'));

        for(int i=0;i<s.length();i++)
            if(vowels.contains(s.charAt(i)))
                vow.append(s.charAt(i));
        
        vow.reverse();

        int pos=0;
        StringBuilder ans = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
            if(vowels.contains(s.charAt(i)))
            {
                ans.setCharAt(i,vow.charAt(pos));
                pos++;
            }
        
        return ans.toString();
    }
}