class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        
        // Record the position of the target char
        LinkedList<Integer> charPos = new LinkedList<Integer>();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == C) charPos.push(i);
        }
        
        for(int j = 0; j < S.length(); j++) {
            int min = minDistance(charPos, j);
            result[j] = min;
        }
        
        return result;
    }
    
    public int minDistance(LinkedList<Integer> l, int index) {
        int min = Math.abs(l.get(0) - index);
        for(int i = 1; i < l.size(); i++) {
            if(Math.abs(l.get(i) - index) < min) {
                min = Math.abs(l.get(i)- index);
            }
        }
        return min;
    }
}
