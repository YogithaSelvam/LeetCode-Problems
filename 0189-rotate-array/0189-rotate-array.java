class Solution {
    
    public int[] reverse(int[] arr,int j,int k){
        int n=j+k;
        for(int i=j;i<n/2;i++){
            int swap=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=swap;
        }
        return arr;
    }
    
    public int[] rotate(int[] nums, int k) {
       int n=nums.length;
        if(k==n) return nums;
        else{
        if(k>n) k=k%n;
        reverse(nums,0,n-k);
        reverse(nums,n-k,n);
        reverse(nums,0,n);
        }
        return nums;
    }
}


