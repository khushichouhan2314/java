import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n;i++){  // key value pair
            if(map.containsKey(nums[i])){  
                map.put(nums[i],map.getOrDefault(nums[i],0)+1); //key would be same only frequency update
            } else { //key not present 
                map.put(nums[i],1); //value would be 1
            }
           
        }
List<Integer> result = new ArrayList<>();
        for(int key: map.keySet()){ //frequency 
            if(map.get(key)> n/3){
                result.add(key);
            }
        }
       return result; 
    }
}