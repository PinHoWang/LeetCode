class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<int>::iterator it;
        int count = 0;
        for(it = nums.begin(); it != nums.end(); (it++)++)
        {
            if(distance(nums.begin(), it) % 2 == 0) count += *it;
        }
        
        return count;
    }
};
