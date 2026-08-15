class Solution {
    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a, a);
    }
    public int findGCD(int[] nums) {
        int mini = nums[0];
        int maxi = nums[0];

        for(int i=0;i<nums.length;i++){
            mini = Math.min(nums[i],mini);
            maxi = Math.max(nums[i],maxi);
        }

        return gcd(maxi,mini);
    }
}