class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int cal=0;
        int sum=(n*(n+1))/2;
        for(int j=0;j<n;j++){
            cal=cal+nums[j];
        }
        return sum-cal;
    }
}