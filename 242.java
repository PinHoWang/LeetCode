class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> set = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!set.containsKey(c)) {
                set.put(c, 1);
            }
            else {
                set.replace(c, set.get(c) + 1); 
            }
        }
        
        for(int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if(!set.containsKey(c)) {
                return false;
            }
            else {
                set.replace(c, set.get(c) - 1);   
            }
        }
        
        ArrayList<Integer> ls =  new ArrayList<>(set.values());
        for(int k = 0; k < ls.size(); k++) {
            if(ls.get(k) != 0) return false; 
        }
        return true;
    }
}
