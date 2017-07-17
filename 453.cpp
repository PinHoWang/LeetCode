class Solution {
public:
    int minMoves(vector<int>& nums) {
        if(nums.empty())
        {
            return 0;
        }
        else
        {
            int count = 0;
            
            // implement
            
            vector<int>::iterator it;
            it = max_element(nums.begin(), nums.end()); // value of the maximum
            int indx_max = distance(nums.begin(), it); // index of the maximum
            
            
            //
            
            return count;
        }
    }
};
