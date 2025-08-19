class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0]; //arr has 1 elem
        if(nums[0]!= nums[1]) return nums[0]; //first element
        if(nums[n-1]!=nums[n-2]) return nums[n-1]; //last element

        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!= nums[mid+1]) return nums[mid];
            int first = mid , second = mid;
            if(nums[mid-1]==nums[mid]){
                  first = mid-1;
            }
            else{
                second = mid+1;
            }
            int leftcount = first-low;
            int rightcount = high - second;
            if(leftcount%2 ==0) low = second+1;
            else high = first-1;
          
       

        }
        return -1;


        
    }
}