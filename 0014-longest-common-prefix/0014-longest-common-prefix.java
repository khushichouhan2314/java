class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;

        Arrays.sort(strs);
        String left = strs[0];
        String right = strs[n - 1];
        int index = 0;

        int min = Math.min(left.length(), right.length());
        while (index <min) {
            if (left.charAt(index) == right.charAt(index)) {
                index++;
            } else {
                break;
            }

        }

        return left.substring(0, index);

    }
}