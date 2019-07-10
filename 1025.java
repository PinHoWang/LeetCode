class Solution {
    public boolean divisorGame(int N) {
        if ( N == 1){
            return false;
        }
        else {
            return !divisorGame(N - 1);
        }
    }
}
