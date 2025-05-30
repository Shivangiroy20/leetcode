class Solution {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;

        while(i < sb.length() -1){
            if(areConsecutive(sb.charAt(i), sb.charAt(i +1))){
                sb.delete(i, i+2);
                i = Math.max(0, i -1);
            }else{
                i++;
            }
        }
        return sb.toString();
    }
    private boolean areConsecutive(char c1, char c2){
        if(Math.abs(c1-c2) == 1) return true;
        if((c1 == 'a' && c2 == 'z') || (c1 == 'z' && c2 == 'a')) return true;

        return false;
    }
}