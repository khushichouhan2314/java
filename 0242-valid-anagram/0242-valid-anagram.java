class Solution {
    public boolean isAnagram(String s, String t) { 
        // we can do this with hash map and array both 

        int s1= s.length();
        int t1 = t.length();

        if(s1!=t1){
            return false ;
        }

        int[] arr= new int [26];
        for (int i =0;i<s1;i++){
            arr[s.charAt(i)-'a']++; //converts the character to an index 
        }

        for(int i =0;i<t1;i++){
            arr[t.charAt(i)-'a']--;
            if(arr[t.charAt(i)-'a']<0){
                return false ;
            }

        }return true;
    }   
    
}