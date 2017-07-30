class Solution {
public:
    string reverseString(string s) {
        string s1;
        for(int i=s.length()-1; i>=0; i--) s1 += s[i];
        return s1;
    }
};
