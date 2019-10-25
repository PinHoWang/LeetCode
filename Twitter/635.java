class LogSystem {
    
    private Map<Integer, String> map;
    public LogSystem() {
        map = new HashMap<>();
    }
    
    public void put(int id, String timestamp) {
        String time = "";
        String[] stamp = timestamp.split(":");
        for(String s : stamp) {
            time += s;
        }
        map.put(id, time);
    }
    
    public List<Integer> retrieve(String s, String e, String gra) {
        String[] ss = s.split(":");
        String startStr = "";
        for(String sss : ss) startStr += sss;
        
        String[] ee = e.split(":");
        String endStr = "";
        for(String eee : ee) endStr += eee;
        
        int gran = -1;
        switch(gra) {
            case "Year":
                gran = 4;
                break;
            case "Month":
                gran = 6;
                break;
            case "Day":
                gran = 8;
                break;
            case "Hour":
                gran = 10;
                break;
            case "Minute":
                gran = 12;
                break;
            case "Second":
                gran = 14;
                break;
            default:
                break;
        }
        
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            int id = entry.getKey();
            String timeStr = entry.getValue();
            long time = Long.valueOf(timeStr.substring(0, gran));
            long start = Long.valueOf(startStr.substring(0, gran));
            long end = Long.valueOf(endStr.substring(0, gran));
            
            if(time >= start && time <= end) result.add(id);
        }
        
        return result;
        
    }
}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(s,e,gra);
 */
