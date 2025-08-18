class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int firstindex = -1;
        int lastindex = -1;

        //first occurence
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target)//go left 
            {
                high = mid - 1;
            } else if (nums[mid]<target) {
                low = mid + 1;

            } else if (nums[mid] == target) {
              
                firstindex = mid;
                high = mid - 1;

            }

        }
        //last occurrence
        low=0;
        high= n-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target)//go right
            {
                high = mid - 1;
            } else if (nums[mid]<target) {
                low = mid + 1;

            } else if (nums[mid] == target) {
               
                lastindex = mid;
                low = mid + 1;

            }

        }
        return new int[] {firstindex, lastindex };

    }
}