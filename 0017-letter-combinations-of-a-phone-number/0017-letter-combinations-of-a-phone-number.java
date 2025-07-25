class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result  = new ArrayList<>();
        if(digits.isEmpty())return result;

        String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        generateCombinations(digits,0,"",map,result);
        return result;
    }

    void generateCombinations(String digits, int index, String current,String[]map, List<String> result){
        if(index  == digits.length()){
            result.add(current);
            return;
        }
        String letters  =  map[digits.charAt(index)- '0'];
        for(char c : letters.toCharArray()){
            generateCombinations(digits,index + 1, current + c,map,result);
        }
    }
}

