class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        
        HashMap<Integer, Integer> times = new HashMap<Integer, Integer>();
        HashMap<Integer, int[]> position = new HashMap<Integer, int[]>();
        for(int i = 0; i < nums.length; i++) {
            // Build times
            if(times.containsKey(nums[i])) {
                times.put(nums[i], times.get(nums[i])+1);
            }else {
                times.put(nums[i], 1);
            }
            
            //Build position
            if(!position.containsKey(nums[i])) {
                
                position.put(nums[i], new int[]{i, i});
            }else {
                int[] pos = position.get(nums[i]);
                int head = pos[0];
                position.put(nums[i], new int[]{head, i});
            }
        }
        
        int degree = 0;
        int key = nums[0];
        Iterator it = times.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, Integer> pair = (Map.Entry<Integer, Integer>) it.next();
            if(pair.getValue() > degree) {
                key = pair.getKey();
                degree = pair.getValue();
            }
            if(pair.getValue() == degree) {
                int[] pre = position.get(key);
                int[] cur = position.get(pair.getKey());
                if((cur[1]-cur[0]) < (pre[1]-pre[0])) {
                    key = pair.getKey();
                }
            }
            it.remove();
        }
        
        int[] in = position.get(key);
        return in[1] - in[0] + 1;
    }
}
