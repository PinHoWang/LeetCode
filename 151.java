class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0) return "";
        
        List<String> ls = new ArrayList<>();
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(temp != "") ls.add(temp);
                temp = "";
            }
            else temp += s.charAt(i);     
            
            if(i == s.length()-1 && temp != "") ls.add(temp); 
        }
        
        String result = "";
        for(int j = ls.size()-1; j >= 0; j--) {
            result += ls.get(j);
            if(j != 0) {
                result += " ";
            }
        }
        
        return result;
    }
}
