class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] A = a.split(" ", 2);
            String[] B = b.split(" ", 2);
            if(A[1].charAt(0) > 58 && B[1].charAt(0) > 58) {
                int cmp = A[1].compareTo(B[1]);
                if(cmp != 0) return cmp;
                return A[0].compareTo(B[0]);
            }
            return A[1].charAt(0) < 58 ? ((B[1].charAt(0) < 58) ? 0 : 1) : -1;
        });
        
        return logs;
    }
}
