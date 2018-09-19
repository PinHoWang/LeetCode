class Solution {
    public int numSpecialEquivGroups(String[] A) {
        if(A.length == 0) return 0;
        
        Set<String> s = new HashSet<>();
        for(String S : A) {
            int[] record = new int[52];
            for(int i = 0; i < S.length(); i++) {
                record[S.charAt(i) - 'a' + 26 * (i%2)]++;   
            }
            s.add(Arrays.toString(record));
        }
        return s.size();
    }
}
