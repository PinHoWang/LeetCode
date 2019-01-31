class Solution {
    public int[][] kClosest(int[][] points, int K) {
        /* Sorted Array */
        // Arrays.sort(points, (x, y) -> x[0]*x[0] + x[1]*x[1] - y[0]*y[0] - y[1]*y[1]);
        // return Arrays.copyOfRange(points, 0, K);
        
        /* max heap */
        PriorityQueue<int[]> pq= new PriorityQueue<int[]>((x, y) -> -(x[0]*x[0] + x[1]*x[1] - y[0]*y[0] - y[1]*y[1]));
        for(int i = 0; i < points.length; i++)
        {
            pq.add(points[i]);
            if(pq.size() > K) pq.poll();
            
        }
        
        int[][] result = new int[K][2];
        int i = 0;
        while(pq.size() != 0) 
        {
            result[i] = pq.poll();
            i++;
        }
        return result;
    }
}
