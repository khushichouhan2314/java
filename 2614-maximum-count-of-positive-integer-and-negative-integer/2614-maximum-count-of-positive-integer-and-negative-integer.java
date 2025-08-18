class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int negcount;
        int poscount;
        //neg count 
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= 0)//go left 
            {
                high = mid - 1;
            } else {
                low = mid + 1;

            } }
            negcount = low;

            low=0;
            high= n-1;

        //pos
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <=0)//go right 
            {
                low = mid+1;
            } 
               else{
                high= mid-1;
               } 
              

            

        }
         poscount = n-low;
         return Math.max(negcount,poscount);

        }

    }
