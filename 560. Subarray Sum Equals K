public class Solution {
    public static int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1); 

        int preSum = 0;
         int cnt = 0; // prefix sum

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int remove = preSum - k; // we have to check whether old prefix sum can make sum equals to k
            cnt += mpp.getOrDefault(remove, 0); // how many time   remove has occurred 
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }}
