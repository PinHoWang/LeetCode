class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        
        vector<int> v;
        
        for(int j = left; j <= right; j++)
        {
            bool flag = true;
            int r = 0;
            int q = j;
            while(q != 0)
            {
                r = q % 10;
                q = q / 10;
                if(r == 0) { flag = false; break; }
                if((j % r) != 0)
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag) v.push_back(j);
        }
        
        return v;
    }
};
