class Solution {
    public String toLowerCase(String str) {
        if(str == "") return str;
        
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int acsii = c;
            if(acsii < 91 && acsii > 64) {
                result += Character.toString((char) (acsii+32));
            }
            else result += c;
        }
        return result;
    }
}
