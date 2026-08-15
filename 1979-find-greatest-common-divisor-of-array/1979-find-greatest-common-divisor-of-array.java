class Solution {
    public int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int findGCD(int[] nums) {
        int mini = nums[0];
        int maxi = nums[0];

        for(int i : nums){
            mini = Math.min(i,mini);
            maxi = Math.max(i,maxi);
        }

        return gcd(maxi,mini);
    }
}