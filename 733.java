class Solution {
    private int startColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] marked = new boolean[image.length][image[0].length];
        startColor = image[sr][sc];
        fillNebor(image, sr, sc, newColor, marked);
        return image;
    }
    
    private void fillNebor(int[][] image, int r, int c, int newColor, boolean[][] marked) {
        if(r < 0 || r > image.length-1) return;
        if(c < 0 || c > image[0].length-1) return;
        if(marked[r][c]) return;
        if(image[r][c] == startColor) {
            image[r][c] = newColor;
        }
        else return;
        marked[r][c] = true;
        fillNebor(image, r+1, c, newColor, marked);
        fillNebor(image, r-1, c, newColor, marked);
        fillNebor(image, r, c+1, newColor, marked);
        fillNebor(image, r, c-1, newColor, marked);
    }
}
