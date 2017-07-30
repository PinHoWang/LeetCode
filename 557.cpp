class Solution {
public:
    string reverseWords(string s) {
        
    int length = 0;
	string temp;
	string result;
        
    while(length != s.length())
	{
		if(s[length] != ' ') { temp += s[length]; }
		else if(s[length] == ' ')
		{
			for(int i=temp.length()-1; i>=0; i--) result += temp[i];
			result += " ";
			temp = "";
		}

		length++;
	}

	for(int i=temp.length()-1; i>=0; i--) result += temp[i];
        
    return result;
    }
};
