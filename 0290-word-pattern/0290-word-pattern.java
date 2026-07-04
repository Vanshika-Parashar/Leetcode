class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            
            if (!map1.containsKey(ch) && !map2.containsKey(word)) {
                map1.put(ch, word);
                map2.put(word, ch);
            }

            
            else {

                
                if (!word.equals(map1.get(ch)))
                    return false;

                
                if (map2.get(word) != ch)
                    return false;
            }
        }

        return true;
    }
}