class Solution {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size() == 0 || timePoints == null) return 0;
        
        boolean[] times = new boolean[1440];
        int index = 0;
        int first = 1441, last = -1;
        for(String s : timePoints)
        {
            if(times[transToMin(s)]) return 0;
            if(transToMin(s) > last) last = transToMin(s);
            if(transToMin(s) < first) first = transToMin(s);
            times[transToMin(s)] = true;
        }
        
        int min = first+1440 - last;
        
        int prev = -1;
        for(int i = 0; i < times.length; i++)
        {
            if(times[i] == true)
            {
                if(prev == -1) 
                {
                    prev = i;
                }
                else 
                {
                    min = Math.min(min, i-prev);
                    prev = i;
                }
            }
        }
        
        return min;
    }
    
    private int transToMin(String s)
    {
        String[] dig = s.split(":");
        return Integer.parseInt(dig[0])*60 + Integer.parseInt(dig[1]);
    }
}
