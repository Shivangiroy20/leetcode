class Solution {
    public String[] divideString(String s, int k, char fill) {
        int totalGroup = (s.length()+ k-1)/k;
        String[]  result = new String[totalGroup];

        int index = 0;
        for(int i=0; i<s.length();i+=k){
            String part = s.substring(i,Math.min(i + k, s.length()));

            if(part.length() < k){
                int missing = k-part.length();
                for(int j=0; j<missing;j++){
                    part += fill;
                    }
            }
            result[index++] = part;
        }
        return result;
    }
}