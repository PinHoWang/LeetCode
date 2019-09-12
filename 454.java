class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
        int size = A.length;
        Map<Integer, Integer> firstMap = new HashMap<>();
        Map<Integer, Integer> secondMap = new HashMap<>();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                // A and B
                int firstSum = A[i] + B[j];
                if(firstMap.containsKey(firstSum)) {
                    firstMap.put(firstSum, firstMap.get(firstSum)+1);
                }
                else firstMap.put(firstSum, 1);
                
                
                // C and D
                int secondSum = C[i] + D[j];
                if(secondMap.containsKey(secondSum)) {
                    secondMap.put(secondSum, secondMap.get(secondSum)+1);
                }
                else secondMap.put(secondSum, 1);
            }
        }
        
        int result = 0;
        for(Map.Entry<Integer, Integer> e : firstMap.entrySet()) {
            int key = e.getKey();
            int counter = e.getValue();
            
            int target = -key;
            if(secondMap.containsKey(target)) result += secondMap.get(target) * counter;
            
        }
        
        return result;
    }
}
