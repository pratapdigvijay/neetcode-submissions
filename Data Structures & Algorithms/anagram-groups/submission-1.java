class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            // Array to store counts of characters a-z
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }

            // Build a unique string key from the frequency array
            // Format example: "1#0#2#0..." means 1 'a', 0 'b', 2 'c'...
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(count[i]);
                sb.append('#'); // Separator prevents collision (e.g., 11 vs 1 and 1)
            }
            String key = sb.toString();

            // Group strings by their frequency signature
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    
    }
}
