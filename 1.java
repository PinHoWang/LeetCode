class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* Brute Force O(N^2)*/
//         int[] result = new int[2];
//         for(int i = 0; i < nums.length; i++)
//         {
//             for(int j = i+1; j < nums.length; j++)
//             {
//                 if(nums[i] + nums[j] == target)
//                 {
//                     result[0] = i;
//                     result[1] = j;
//                 }
//             }
//         }
        
//         return result;
        
        int[] dupNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(dupNums);
        int i = 0, j = nums.length-1;
        while(true) 
        {
            if(dupNums[i] + dupNums[j] > target) j--;
            else if(dupNums[i] + dupNums[j] < target) i++;
            else break;
        }
        
        int[] result = new int[2];
        boolean flag = true;
        for(int k = 0; k < nums.length; k++) 
        {
            if(nums[k] == dupNums[i] && flag) 
            {
                result[0] = k;
                flag = false;
            }
            else if(nums[k] == dupNums[j]) result[1] = k;
        }
        
        return result;
    }
}
