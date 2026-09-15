class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int idx=0;
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<pushed.length;i++){
            stk.push(pushed[i]);
            while(!stk.isEmpty() && stk.peek()==popped[idx]){
                stk.pop();
                idx++;
            }
        }

        if(stk.isEmpty())
            return true;
        return false;
        
    }
    
}