class Solution {
    public boolean isNStraightHand(int[] hand, int W) {        
        Map<Integer, Integer> wh = new TreeMap<>();
        for(int i : hand) wh.put(i, wh.getOrDefault(i, 0)+1);
        
        for(int it : wh.keySet())
        {
            if(wh.get(it) > 0)
            {
                for(int j = W-1; j >= 0; --j)
                {
                    if(wh.getOrDefault(it + j, 0) < wh.get(it)) return false;
                    wh.put(it+j, wh.get(it+j)-wh.get(it));
                }
            }
        }
        return true;
    }
}
