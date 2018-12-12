class Solution {
    public int minDeletionSize(String[] A) {
        if(A.length == 0) return 0;
        
        List<Integer> dList = new ArrayList<>();
        int stringSize = A[0].length();
        for(int i = 0; i < stringSize; i++) {
            String s = A[0];
            for(int j = 1; j < A.length; j++) {
                char c = s.charAt(i);
                if((int) c > (int) A[j].charAt(i)) {
                    dList.add(i);
                    break;
                }
                s = A[j];
            }
        }
        
        return dList.size();
    }
}
