class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0;
        int oddIndex = 1;
        int result[]  = new int[nums.length];

        for(int num : nums)
        if(num % 2 == 0){
        result[evenIndex] = num;
        evenIndex += 2;
        }else{
        result[oddIndex] = num;
        oddIndex  += 2;
        }
        return result;
    }
}