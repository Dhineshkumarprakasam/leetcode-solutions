class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String i : operations){
            if(i.equals("--X") || i.equals("X--"))
                x--;
            else if(i.equals("X++") || i.equals("++X"))
                x++;
        }

        return x;
    }
}