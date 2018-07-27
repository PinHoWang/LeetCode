class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        Integer[] pre = new Integer[]{1};
        for(int i = 1; i <= rowIndex+1; i++) {
            Integer[] row = new Integer[i];
            row[0] = 1;
            row[i-1] = 1;
            for(int j = 1; j < i-1; j++) {
                row[j] = pre[j-1] + pre[j];
                //row.add(j, pre.get(j-1)+pre.get(j));
            }
            //List<Integer> list = Arrays.asList(row);
            pre = row.clone();
        }
        return Arrays.asList(pre);
    }
}
