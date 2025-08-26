class Solution {
    public String reverseVowels(String s) {
        // convert to char array for in-place swapping
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        
        // define vowels
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            // move left pointer until vowel
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            // move right pointer until vowel
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            
            // swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(arr);
    }
}
