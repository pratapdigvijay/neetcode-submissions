class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Keep a Min-Heap of size k
        // We sort the elements in the heap based on their frequency (ascending)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> frequencyMap.get(a) - frequencyMap.get(b)
        );

        for (int num : frequencyMap.keySet()) {
            minHeap.add(num);
            // If the heap exceeds size k, remove the element with the lowest frequency
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 3: Extract the elements from the heap into the result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    
    }
}
