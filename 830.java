class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        if(S.length() < 3) return new LinkedList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        int cons = 1;
        int start = 0;
        for(int i = 1; i < S.length(); i++) {
            if(S.charAt(i) == S.charAt(i-1)) {
                if(cons == 1) { start = i-1; }
                cons++;
                //System.out.println(S.charAt(i));
            }
            else {
                if(cons >= 3) {
                    //Put position into List
                    //(start to i-1)
                    result.add(Arrays.asList(start, i-1));
                    start = 0;
                }
                cons = 1;
            }
        }
        if(cons >= 3) {
            result.add(Arrays.asList(start, S.length()-1));
        }
        
        return result;
    }
}
