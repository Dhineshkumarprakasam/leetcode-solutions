class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y; 
        int count = 0;
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}