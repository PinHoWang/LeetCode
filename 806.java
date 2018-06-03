class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int total = 0;
        int lines = 1;
        for(int i = 0; i < S.length(); i++) {
            int charWidth = widths[S.charAt(i) - 'a'];
            if(total + charWidth > 100) {
                lines += 1;
                total = charWidth;
            }
            else if(total + charWidth == 100) {
                lines += 1;
                total = 0;
            }
            else {
                total += charWidth;
            }
        }
        int[] result = {lines, total};
        return result;
    }
}
