// class RLEIterator {

//     private Queue<Integer> q = new LinkedList<>();
//     public RLEIterator(int[] A) {
//         int i = 0;
//         while(i < A.length-1)
//         {
//             int time = A[i];
//             int val = A[i+1];
//             for(int j = 0; j < time; j++)
//             {
//                 q.add(val);
//             }
//             i += 2;
//         }
    
//     }
    
//     public int next(int n) {
//         if(q.peek() == null) return -1;
//         int result = q.peek();
//         while(n > 0)
//         {
//             if(q.size() == 0) return -1;
//             result = q.poll();
//             n--;
//         }
//         return result;
//     }
// }


/** Without memory limit excessed **/
class RLEIterator {

    private int i = 0;
    private List<Integer> ls = new ArrayList<>();
    public RLEIterator(int[] A) {
        for(int i : A) ls.add(i);
    }
    
    public int next(int n) {
        if(i > ls.size()-1) return -1;
        if(ls.get(i) >= n)
        {
            ls.set(i, ls.get(i) - n);
            return ls.get(i+1);
        }
        else 
        {
            while(i < ls.size()-1)
            {
                if(n > ls.get(i)) 
                { 
                    n -= ls.get(i);
                    ls.set(i, 0);
                    i += 2;
                    continue;
                }
                else
                {
                    ls.set(i, ls.get(i)- n);
                    return ls.get(i+1);
                }
            }
        }
        return -1;
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */
/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */
