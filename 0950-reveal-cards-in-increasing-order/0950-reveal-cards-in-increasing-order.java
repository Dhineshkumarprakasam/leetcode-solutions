class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> q = new ArrayDeque<>();
        int n = deck.length;
        for(int i=n-1;i>=0;i--){
            if(!q.isEmpty()){
                q.addFirst(q.removeLast());
            }
            q.addFirst(deck[i]);
        }

        for(int i=0;i<n;i++){
            deck[i]=q.removeFirst();
        }

        return deck;
    }
}