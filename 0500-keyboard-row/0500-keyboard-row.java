class Solution {
    public String[] findWords(String[] words) {
        String[] rows  ={"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result  = new ArrayList<>();

        for(String word : words){
            String lower  = word.toLowerCase();

            for(String row : rows){
                if(lower.chars().allMatch(c->row.indexOf(c) != -1)){
                    result.add(word);
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }
}