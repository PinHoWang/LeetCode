class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        
        vector<int> result;
        if(nums1.empty() || nums2.empty()) return result;
        
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        //if(nums1.size() > nums2.size())
        //{
            vector<int>::iterator it1 = nums1.begin();
            vector<int>::iterator it2 = nums2.begin();
            while(true)
            {
                if(it1 == nums1.end() || it2 == nums2.end()) break;
                if(*it1 == *it2)
                {
                    result.push_back(*it1);
                    it1++;
                    it2++;
                }
                else if(*it1 > *it2)
                {
                    it2++;
                }
                else if(*it1 < *it2)
                {
                    it1++;
                }
            }
            return result;
        //}
    }
};
