class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<target) // go right
{
    low = mid+1;}
    else if(nums[mid]>target) // go left 
    {
        high = mid-1;
    }
    else if (nums[mid]==target){
        return mid;
} }
return -1;
            

        
        
    
}}