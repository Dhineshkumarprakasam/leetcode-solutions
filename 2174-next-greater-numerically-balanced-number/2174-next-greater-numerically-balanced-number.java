class Solution {

    public boolean isBalanced(int number){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        while(number>0){
            map.put(number%10,map.getOrDefault(number%10,0)+1);
            number=number/10;
        }

        for(var i : map.entrySet()){
            if(i.getKey()!=i.getValue())
                return false;
        }

        return true;
    }

    public int nextBeautifulNumber(int n) {
        int number = n+1;

        while(!isBalanced(number)){
            number++;
        }

        return number;
    }
}