class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet  = new HashSet<>();
        for(String b : banned){
            bannedSet.add(b.toLowerCase());

        }
        paragraph = paragraph.replaceAll("\\W+", " ").toLowerCase();
        String[] words  = paragraph.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for(String word : words){
            if(!bannedSet.contains(word) && word.length() > 0){
                map.put(word, map.getOrDefault(word,0) + 1);
            }
        }
        String result  = "";
        int max  = 0;

        for(String  word : map.keySet()){
            if(map.get(word) > max){
                max  = map.get(word);
                result  = word;
            }
        }
        return result;

    }
}