class Solution {
    public String reverseWords(String s) {

        int i = 0;

        String[] words = s.trim().split("\\s+");
        int n = words.length;
        int j = n - 1;
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", words);

    }
}