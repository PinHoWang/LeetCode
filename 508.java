/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        
        sumSubTree(root, map);
        
        List<Map.Entry<Integer, Integer>> result = new ArrayList<>();
        Map.Entry<Integer, Integer> maxEntry = null;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(maxEntry == null || entry.getValue() == maxEntry.getValue()) {
                maxEntry = entry;
                result.add(entry);
            }
            else if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                result = new ArrayList<>();
                maxEntry = entry;
                result.add(entry);
            }
            
            
        }
        
        int[] a = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            a[i] = result.get(i).getKey();
        }
        return a;
    }
    
    private int sumSubTree(TreeNode node, Map<Integer, Integer> map) {
        if(node == null) return 0;
        
        int sum = node.val + sumSubTree(node.left, map) + sumSubTree(node.right, map);
        if(map.containsKey(sum)) {
            map.replace(sum, map.get(sum)+1);
        }
        else map.put(sum, 1);
        
        return sum;
    }
}
