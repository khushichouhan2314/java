import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int characterReplacement(String s, int k) {

        int[] charCount = new int[26];
        
    
        int windowStart = 0;
       
        int maxLength = 0;
      
        int maxCharCount = 0;

     
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            // Get the character at the current right pointer.
            char rightChar = s.charAt(windowEnd);
            
          
            charCount[rightChar - 'A']++;
            
         
            maxCharCount = Math.max(maxCharCount, charCount[rightChar - 'A']);
            
      
            if ((windowEnd - windowStart + 1) - maxCharCount > k) {
           
                char leftChar = s.charAt(windowStart);
                
         
                charCount[leftChar - 'A']--;
                
                windowStart++;
            }
      
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        
        return maxLength;
    }
}