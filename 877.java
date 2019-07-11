class Solution {
    public boolean stoneGame(int[] piles) {
        if(piles == null || piles.length == 0) return false;
        
        return helper(piles, 0, piles.length - 1, 0, 0, 0);
    }
    
    private boolean helper(int[] piles, int first, int last, int player, int comp, int turns) {
        if(last - first == 1) {
            return (player + piles[first] > comp + piles[last]) || (player + piles[last] > comp + piles[last]);
        }
        
        if(turns % 2 == 0) {
            return helper(piles, first + 1, last, player + piles[first], comp, turns++) || helper(piles, first, last - 1, player + piles[last], comp, turns++);
        }
        else {
            return helper(piles, first + 1, last, player, comp + piles[first], turns++) || helper(piles, first, last - 1, player, comp + piles[last], turns++);
        }
    }
}
