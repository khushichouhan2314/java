import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxlen= 0 ; 
        int maxrepeat = 0;
        int n = s.length();

       Map<Character,Integer> map= new HashMap<>();
       for(right=0;right<n;right++){
        char curr = s.charAt(right);
        map.put(curr, map.getOrDefault(curr,0)+1);

        maxrepeat= Math.max(maxrepeat,map.get(curr));
        int nonrepeat = (right-left+1)-maxrepeat;

        if(nonrepeat>k){
            map.put(s.charAt(left),map.get(s.charAt(left))-1);
            left++;
        }

        maxlen=Math.max(maxlen, right-left+1);

       }

       return maxlen;


        
    }
}