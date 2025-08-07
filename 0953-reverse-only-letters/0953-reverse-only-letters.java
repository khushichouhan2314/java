class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        char[] charArray = s.toCharArray();
       

        while(i<j){
            if(!Character.isLetter(charArray[i])){
                i++;
            }
             else if(!Character.isLetter(charArray[j])){
                j--;
            }
            else{
                char temp= charArray[i];
                charArray[i++]= charArray[j];
                charArray[j--]= temp;
            }


        } 
        return new String(charArray);
    }
}