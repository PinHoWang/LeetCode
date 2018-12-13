class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        boolean[] marked = new boolean[N+1];
        Integer[] distTo = new Integer[N+1];
        
        // Construct distTo
        for(int i = 0; i < N+1; i++) {
            distTo[i] = Integer.MAX_VALUE;
            marked[i] = false;
        }
        
        // Handle index 0
        distTo[0] = 0;
        marked[0] = true;
        
        Queue<Integer> q = new LinkedList<>();
        distTo[K] = 0;
        q.add(K);
        while(q.size() != 0) {
            int v = q.poll();
            marked[v] = true;
            List<int[]> adj = adj(times, v);
            for(int j = 0; j < adj.size(); j++) {
                relax(adj.get(j), distTo, q);
            }
        }
        
        for(int k = 0; k < N+1; k++) {
            if(!marked[k]) return -1;
        }

        int result = Integer.MIN_VALUE;
        for(int m = 1; m < N+1; m++) {
            result = Math.max(distTo[m], result);
        }
        
        return result;
    }
    
    private List<int[]> adj(int[][] times, int v) {
        List<int[]> ls = new LinkedList<>();
        for(int i = 0; i < times.length; i++) {
            if(times[i][0] == v) ls.add(times[i]);
        }
        return ls;
    }
    
    private void relax(int[] edge, Integer[] distTo, Queue<Integer> q) {
        if(distTo[edge[1]] > distTo[edge[0]] + edge[2]) {
            distTo[edge[1]] = distTo[edge[0]] + edge[2];
            if(!q.contains(edge[1])) q.add(edge[1]);
        }
        
    }
}
