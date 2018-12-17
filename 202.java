class Solution {
    
    private Set<Integer> record = new HashSet<>();
    
    public boolean isHappy(int n) {
        if(n == 1) return true;
        if(record.contains(n)) return false;
        
        record.add(n);
        int sum = 0;
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++) {
            sum += Math.pow(Character.getNumericValue(s.charAt(i)), 2);
        }
        return isHappy(sum);
    }
}
