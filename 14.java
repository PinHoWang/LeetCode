class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        StringBuilder sb = new StringBuilder(strs[0]);
        int i = sb.length() - 1;
        int j = 1;
        while(i >= 0 && j < strs.length) {
            if(strs[j].indexOf(sb.toString()) != 0) {
                sb.deleteCharAt(i);
                i--;
            }
            else {
                j++;
            }
        }
        return sb.toString();
    }
}
