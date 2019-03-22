class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }
            else map.put(i, 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.add(e);
        }
        
        List<Integer> result = new ArrayList<>();
        while(pq.size() != 0) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            result.add(entry.getKey());
            k--;
            if(k < 1) break;
        }
        
        return result;
    }
}
