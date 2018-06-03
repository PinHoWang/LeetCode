class Solution {
    public int numJewelsInStones(String J, String S) {
        
        // Construct S to hashmap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < S.length(); i++) {
            if(!map.containsKey(S.charAt(i))) {
                map.put(S.charAt(i), 1);   
            }
            else {
                int n = (int) map.get(S.charAt(i));
                map.put(S.charAt(i), n+1);
            }
        }
        
        // Search the Jewels
        int count = 0;
        for(int j = 0; j < J.length(); j++) {
            if(map.containsKey(J.charAt(j))) {
                count += (int) map.get(J.charAt(j));   
            }
        }
        return count;
    }
}
