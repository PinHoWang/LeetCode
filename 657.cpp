class Solution {
public:
    bool judgeCircle(string moves) {
        if((moves.size()) % 2 != 0) return false;
        else
        {
            int r=0, l=0, u=0, d=0; //numbers of R L U D in string
            for(string::iterator it = moves.begin(); it != moves.end(); it++)
            {
                if(*it == 'R') r++;
                if(*it == 'L') l++;
                if(*it == 'U') u++;
                if(*it == 'D') d++;
            }
            if((r == l) && (u == d)) return true;
            else return false;
        }
    }
};
