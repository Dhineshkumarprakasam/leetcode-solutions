class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        int idx=0;
        Stack<Integer> stk = new Stack<>();
        for(int i : pushed){
            stk.push(i);
            while(!stk.isEmpty() && stk.peek()==popped[idx]){
                stk.pop();
                idx++;
            }
        }

        return stk.isEmpty();


    }
}