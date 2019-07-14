class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0 || stones == null) return 0;
        if(stones.length == 1) return stones[0];
        
        List<Integer> arr = new ArrayList<Integer>();
        for(int i : stones) arr.add(i);
        
        while(arr.size() > 1) {
            Collections.sort(arr, Collections.reverseOrder());
            int newValue = arr.get(0) - arr.get(1);
            arr.remove(0);
            arr.remove(0);
            if(newValue != 0) arr.add(newValue);
        }
        
        return arr.size() == 1 ? arr.get(0) : 0;
        
    }
}
