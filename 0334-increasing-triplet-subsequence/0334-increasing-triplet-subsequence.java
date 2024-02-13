class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for(int ele : nums){
            if(ele <= a) a = ele;
            else if(ele < b) b = ele;
            else if(ele > b) return true;
        }
        return false;
    }
}