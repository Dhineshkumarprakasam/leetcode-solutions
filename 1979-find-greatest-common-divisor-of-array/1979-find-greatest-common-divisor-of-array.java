class Solution {
    public static int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];

        for(int i : nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        return gcd(min,max);
    }
}