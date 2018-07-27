class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new LinkedList<>();
        
        List<List<Integer>> pascal = new LinkedList<>();
        
        
        Integer[] pre = new Integer[]{1};
        for(int i = 1; i <= numRows; i++) {
            Integer[] row = new Integer[i];
            row[0] = 1;
            row[i-1] = 1;
            for(int j = 1; j < i-1; j++) {
                row[j] = pre[j-1] + pre[j];
                //row.add(j, pre.get(j-1)+pre.get(j));
            }
            List<Integer> l = Arrays.asList(row);
            pascal.add(l);
            pre = row.clone();
        }
        
        return pascal;
    }
}
