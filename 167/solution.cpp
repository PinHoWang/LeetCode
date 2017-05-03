class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        
        vector<int> twoIndx;
        if(target > 2*numbers[numbers.size()/2])
        {
            int flag = 0;
            for(int i=numbers.size()/2; i<numbers.size(); i++)
            {
                for(int j=0; j<numbers.size(); j++)
                {
                    if((numbers[i]+numbers[j]) == target)
                    {
                        twoIndx.push_back(i+1);
                        twoIndx.push_back(j+1);
                        flag++;
                        break;
                    }
                }
                if(flag == 1) break;
            }
        }
        else
        {
            int flag = 0;
            for(int i=0; i<numbers.size()/2; i++)
            {
                for(int j=i+1; j<numbers.size(); j++)
                {
                    if((numbers[i]+numbers[j]) == target)
                    {
                        twoIndx.push_back(i+1);
                        twoIndx.push_back(j+1);
                        flag++;
                        break;
                    }
                }
                if(flag == 1) break;
            }
        }
        
        sort(twoIndx.begin(), twoIndx.end());
        return twoIndx;
    }
};
