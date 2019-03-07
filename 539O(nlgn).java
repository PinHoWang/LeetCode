class Solution {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size() == 0 || timePoints == null) return 0;
        
        int[] times = new int[timePoints.size()];
        int index = 0;
        for(String s : timePoints)
        {
            times[index] = transToMin(s);
            index++;
        }
        
        Arrays.sort(times);
        int min = times[0]+1440 - times[times.length-1];
        
        for(int i = 0; i < times.length-1; i++)
        {
            if(times[i+1] - times[i] < min) min = times[i+1] - times[i];
        }
        
        return min;
    }
    
    private int transToMin(String s)
    {
        String[] dig = s.split(":");
        return Integer.parseInt(dig[0])*60 + Integer.parseInt(dig[1]);
    }
}
