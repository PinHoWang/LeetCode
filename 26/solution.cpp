class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        nums.erase(unique(nums.begin(), nums.end()), nums.end());
        sort(nums.begin(), nums.end());
        
        return nums.size();
    }
};
