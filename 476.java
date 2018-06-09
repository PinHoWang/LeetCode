class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
		int t = (int) (Math.pow(2, s.length()) - 1);
		return t - num;
    }
}
