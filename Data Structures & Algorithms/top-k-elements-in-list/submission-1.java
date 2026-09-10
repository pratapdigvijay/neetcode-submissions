class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
    
        for(int n : nums){
        
                map.put(n,map.getOrDefault(n,0)+1);
        }
               List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

                // Step 3: Naively sort the entire list by frequency in descending order
                entryList.sort((a, b) -> b.getValue() - a.getValue());

                // Step 4: Extract the top k elements into the result array
                int[] result = new int[k];
                for (int i = 0; i < k; i++) {
                      result[i] = entryList.get(i).getKey();
                }

         return result;
            
        }
    
}
