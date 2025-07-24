class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        ArrayList<String> data = new ArrayList<>(Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."));

        HashMap<String,Integer> ans = new HashMap<>();
        for(String word : words)
        {
            StringBuilder s = new StringBuilder();
            for(char i : word.toCharArray())
                s.append(data.get((i-'a')));
            ans.put(s.toString(),ans.getOrDefault(s.toString(),0)+1);
        }

        return ans.size();


    }
}