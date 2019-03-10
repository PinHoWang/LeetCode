class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // Built the array record all char in p, including # of char
        int[] table = new int[26];
        for(int i = 0; i < p.length(); i++) table[p.charAt(i)-'a']++;
        
        List<Integer> result = new ArrayList<>();
        for(int j = 0; j <= s.length()-p.length(); j++) {
            int[] temp = Arrays.copyOf(table, table.length);
            boolean flag = true;
            for(int k = j; k < j+p.length(); k++) temp[s.charAt(k) - 'a']--;
            
            for(int ii : temp) {
                if(ii != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) result.add(j);
        }
        
        return result;
    }
}
