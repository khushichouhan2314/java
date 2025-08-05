import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       //map to put values 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

       //set to put unique value only 
      HashSet<Integer> set= new HashSet<>();

      for(int freq:map.values()){

        if(!set.add(freq)){
            return false;
        }
      }
        return true; // all frequencies are unique
    }
}
