class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> inter;
        if(nums1.size() > nums2.size())
        {
            unordered_set<int> set;
            for(int i=0; i<nums1.size(); i++) set.insert(nums1[i]);
            for(int j=0; j<nums2.size(); j++)
            {
                if(set.count(nums2[j])) inter.push_back(nums2[j]);
            }
        }
        else
        {
            unordered_set<int> set;
            for(int i=0; i<nums2.size(); i++) set.insert(nums2[i]);
            for(int j=0; j<nums1.size(); j++)
            {
                if(set.count(nums1[j])) inter.push_back(nums1[j]);
            }
        }
        
        sort(inter.begin(), inter.end());
        inter.erase(unique(inter.begin(), inter.end()), inter.end());
        return inter;
    }
};
