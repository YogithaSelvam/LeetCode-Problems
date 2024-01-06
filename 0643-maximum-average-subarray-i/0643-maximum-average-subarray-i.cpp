class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
      int i = 0 , n = nums.size() ;
        double windowSum = 0;
		for( i = 0 ; i < k ; i++){
			windowSum+=nums[i];
		}
         double max = windowSum;
		for( i = k ; i < n ; ++i){
			windowSum += nums[i] - nums[i-k];
			if(windowSum  > max){
				max = windowSum;
			}
		}     
		return max/k; 
    }
    
};