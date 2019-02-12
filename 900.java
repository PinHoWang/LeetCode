class RLEIterator {

    private Queue<Integer> q = new LinkedList<>();
    public RLEIterator(int[] A) {
        int i = 0;
        while(i < A.length-1)
        {
            int time = A[i];
            int val = A[i+1];
            for(int j = 0; j < time; j++)
            {
                q.add(val);
            }
            i += 2;
        }
    
    }
    
    public int next(int n) {
        if(q.peek() == null) return -1;
        int result = q.peek();
        while(n > 0)
        {
            if(q.size() == 0) return -1;
            result = q.poll();
            n--;
        }
        return result;
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */
