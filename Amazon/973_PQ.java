class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(K, (a, b) -> {
            return a[0]*a[0] + a[1]*a[1] - b[0]*b[0] - b[1]*b[1];
        });
        
        for(int[] nums : points) pq.add(nums);
        
        int[][] result = new int[K][2];
        for(int i = 0; i < result.length; i++) result[i] = pq.poll();
        
        return result;
        
    }
}
