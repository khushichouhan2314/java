class Solution {
    public int lengthOfLongestSubstring(String s) { 
        // all the substring element should be unique
     
        int n = s.length();
        int left=0;
        int right = 0;
        int maxlen=0;
        HashSet<Character>set = new HashSet<>(); //to avoid duplicate values

        while(right<n){

        char current = s.charAt(right); //store index of right in current

 if(!set.contains(current)){ //if not in set thn unique

    set.add(current); //add bcoz unique
    maxlen= Math.max(maxlen,right-left+1);
    right++;
 } else{
    set.remove(s.charAt(left));
    left++;
 }
        } return maxlen;











        
        
    }
}