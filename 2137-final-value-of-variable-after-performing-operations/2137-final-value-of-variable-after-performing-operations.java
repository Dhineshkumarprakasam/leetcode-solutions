class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String i : operations){
            if(i.contains("-"))
                x--;
            else
                x++;
        }

        return x;
    }
}