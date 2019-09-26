class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // Absolute difference means the distance between two integer
        // We can first sort the array
        // Exception
        if(arr.length == 0 || arr == null) return new ArrayList<>();
        
        // TC: O(nlgn)
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        
        // SC: O(n)
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        // TC: O(n)
        while(i < arr.length-1) {
            // SC: O(n)
            List<Integer> cur = new ArrayList<>();
            // When to add cur to result list?
            // Two situations:
            //   1. There is only one result
            //        Just find the min one
            //   2. There are more than one result
            //        We have to compare each pair and add "them" into result list
            if(Math.abs(arr[i] - arr[i+1]) <= min) {
                if(Math.abs(arr[i] - arr[i+1]) < min) result.clear();
                cur.add(arr[i]);
                cur.add(arr[i+1]);
                min = Math.abs(arr[i] - arr[i+1]);
                if(cur.size() != 0) result.add(cur);
            }
            i++;
        }
        
        return result;
    }
}
