class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int count = 0;
        
        LinkedList<String> l = new LinkedList<String>();
        for(int i = 0; i < words.length; i++) {
            String temp = convertCode(words[i]);
            if(uniqueCode(l, temp)) l.add(temp);
        }
        return l.size();
    }
    
    // Return true if string s is unique in list, otherwise false
    private boolean uniqueCode(LinkedList l, String s) {
        return !l.contains(s);
    }
    
    // 
    private String convertCode(String s) {
        String code = "";
        for(int i = 0; i < s.length(); i++) {
            code.concat(getMorseCode(s.charAt(i)));
        }
        return code;
    }
    
    private String getMorseCode(char c) {    
        
        switch(c) {
            case 'a': return ".-";
            case 'b': return "-...";
            case 'c': return "-.-.";
            case 'd': return "-..";
            case 'e': return ".";
            case 'f': return "..-.";
            case 'g': return "--.";
            case 'h': return "....";
            case 'i': return "..";
            case 'j': return ".---";
            case 'k': return "-.-";
            case 'l': return ".-..";
            case 'm': return "--";
            case 'n': return "-.";
            case 'o': return "---";
            case 'p': return ".--.";
            case 'q': return "--.-";
            case 'r': return ".-.";
            case 's': return "...";
            case 't': return "-";
            case 'u': return "..-";
            case 'v': return "...-";
            case 'w': return ".--";
            case 'x': return "-..-";
            case 'y': return "-.--";
            case 'z': return "--..";
            default: return "";
        }
    
    }
}
