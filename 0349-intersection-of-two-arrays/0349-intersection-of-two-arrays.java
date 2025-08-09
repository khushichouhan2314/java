class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
       
        if(n1> n2){
            return intersection(nums2 , nums1);
        }

        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
        set1.add(num);
        }

         Set<Integer> resultset = new HashSet<>();
          for(int num : nums2){
            if(set1.contains(num)){
        resultset.add(num);
        }}

        int [] result = new int[resultset.size()];
        int index = 0;
        for (int num:resultset){
            result[index++]= num;
        }

return result;

    }
}