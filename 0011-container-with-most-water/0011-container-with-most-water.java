/*

SOLUTION 1:

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int k;
        int water=0,max_water=0;
        for(int i=0;i<n;i++){
            k=1;
          for(int j=i+1;j<n;j++){
              if(height[i]<=height[j]){
                  water=height[i]*k;
              }
              if(height[i]>height[j]){
                  water=height[j]*k;
              }
              k++;
              max_water=Math.max(water,max_water);
          }
        }
        return max_water;
    }
}*/

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
