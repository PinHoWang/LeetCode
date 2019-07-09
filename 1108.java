class Solution {
    public String defangIPaddr(String address) {
        if(address == null || address.length() == 0) return "";
        
        List<Character> charResult = new ArrayList<>();
        char[] charArr = address.toCharArray();
        for(char c : charArr) {
            if(c == '.') {
                charResult.add('[');
                charResult.add('.');
                charResult.add(']');
            }
            else charResult.add(c);
            // charResult.add(c);
        }
        
        return charResult.toString().substring(1, 3 * charResult.size() - 1)
            .replaceAll(", ", "");
                            
    }
}
