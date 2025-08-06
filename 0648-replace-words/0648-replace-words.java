class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        // store root words in set
        Set<String> rootSet = new HashSet<>(dictionary);
        // split the sentence 
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {

            String prefix = "";
            boolean replaced = false;
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (rootSet.contains(prefix)) {
                    result.append(prefix);
                    replaced = true;
                    break;
                }

            }

            if (!replaced) {
                result.append(word);
            }
            result.append(" ");

        }
        return result.toString().trim();

    }
}