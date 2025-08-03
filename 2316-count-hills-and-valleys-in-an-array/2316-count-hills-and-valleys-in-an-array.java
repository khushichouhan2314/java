// class Solution {
//     public int countHillValley(int[] nums) {
//         int count=0;
      

//         int n = nums.length;

//     for (int i = 1; i<n-1;i++){
//         if (nums[i-1]==nums[i]|| nums[i+1]== nums[i]){
//             continue;
//         }
// int prev=i-1;
//         while(prev>=0 && nums[i-1]==nums[i]){
//             prev--;
//         }

//         int next=i+1;
//         while(next<n && nums[i+1]==nums[i]){
//             next++;
//         }
     
//         if ((nums[i-1]<nums[i]&& nums[i+1]<nums[i] ||nums[i-1]>nums[i]&& nums[i+1]>nums[i])){
//            count++;
//         } 
      
//     } return count;
        
//     }
// }


class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n - 1; i++) {
           
            if (nums[i] == nums[i - 1]) continue;

          
            int prev = i - 1;
            while (prev >= 0 && nums[prev] == nums[i]) {
                prev--;
            }

          
            int next = i + 1;
            while (next < n && nums[next] == nums[i]) {
                next++;
            }

          
            if (prev >= 0 && next < n) {
                if ((nums[i] > nums[prev] && nums[i] > nums[next]) ||
                    (nums[i] < nums[prev] && nums[i] < nums[next])) {
                    count++;
                }
            }
        }

        return count;
    }
}
