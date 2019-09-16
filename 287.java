class Solution {
    public int findDuplicate(int[] nums) {
        /**
          * Conditions:
          * 1. n+1 integers
          * 2. The value of elements are 1 to n
          * 3. At least one duplicate
          * 4. Read-only array
          * 5. O(1) space -> No set or new array allowed
          * 6. Less than O(n2) runtime
          * 7. The only duplicate number may repeat more than once
        **/
        
        // We first ignore some condition
        // 1. Sorting
//         if(nums.length == 0 || nums == null) return -1;
        
//         Arrays.sort(nums);
//         for(int i = 0; i < nums.length-1; i++) {
//             if(nums[i] == nums[i+1]) return nums[i];
//         }
//         return -1;
        
        // 2. Set
    //     Set<Integer> s = new HashSet<>();
    //     for(int i : nums) {
    //         if(s.contains(i)) return i;
    //         else s.add(i);
    //     }
    //     return -1;
        
        // 3. Cycle Detection
        // Intuition: Each pair of index i and value vi; the 'next' value vj is at index vi;
        // Caution: Index 0 cannot be part of the cycle
        if(nums.length == 0 || nums == null) return -1;
        
        for(int i = 1; i < nums.length; i++) if(nums[i] == nums[0]) return nums[0];
        int fastPtr = nums[0], slowPtr = nums[0];
        while(true) {
            fastPtr = nums[nums[fastPtr]];
            slowPtr = nums[slowPtr];
            if(fastPtr == slowPtr) break;
        }
        
        int newPtr = nums[0];
        while(true) {
            newPtr = nums[newPtr];
            slowPtr = nums[slowPtr];
            if(newPtr == slowPtr) return newPtr;
        }
    }
    
}
