class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        if(paragraph == "") return "";
        
        Map<String, Integer> map = new HashMap<>();
        String word = "";
        for(int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if((int) c >= 65 && (int) c <= 90) {
                c = (char) ((int) c + 32);
                word += c;
            }
            else if((int) c >= 97 && (int) c <= 122) word += c;
            else {
                if(word == "") continue;
                addToMap(map, word);
                word = "";
            }
        }
        
        if(word != "") {
            addToMap(map, word);
        }
        
        for(String s : banned) {
            if(map.containsKey(s)) map.remove(s);
        }
        
        String result = "";
        int max = Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                result = entry.getKey();
                max = entry.getValue();
            }
        }
        
        return result;
        
    }
    
    private void addToMap(Map<String, Integer> map, String word) {
        if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else map.put(word, 1);
    }
}
