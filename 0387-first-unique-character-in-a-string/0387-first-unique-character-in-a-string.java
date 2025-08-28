class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();

    
        for (int i = 0; i < n; i++) {
            int freq = s.charAt(i) - 'a';
            count[freq]++;
        }

      
        for (int i = 0; i < n; i++) {
            int freq = s.charAt(i) - 'a';
            if (count[freq] == 1) {
                return i;  
            }
        }
return -1;
    }}
    