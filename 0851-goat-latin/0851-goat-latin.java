class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        StringBuilder result  = new StringBuilder();

        for(int i=0; i<words.length;i++){
            String word = words[i];

            if(vowels.indexOf(word.charAt(0)) != -1){
                result.append(word);
            }else{
                result.append(word.substring(1)).append(word.charAt(0));
            }
            result.append("ma");

            for(int j=0; j<=i;j++){
                result.append("a");
            }
            if(i != words.length -1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}