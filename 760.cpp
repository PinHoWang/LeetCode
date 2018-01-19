class Solution {
public:
    vector<int> anagramMappings(vector<int>& A, vector<int>& B) {
        vector<int> C;
        for(vector<int>::iterator itA = A.begin(); itA != A.end(); itA++)
        {
            int count = 0;
            for(vector<int>::iterator itB = B.begin(); itB != B.end(); itB++)
            {
                if(*itA == *itB) { C.push_back(count); break; }
                count++;
            }
        }
        return C;
    }
};
