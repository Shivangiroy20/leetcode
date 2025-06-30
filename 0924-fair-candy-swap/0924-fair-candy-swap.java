class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for(int a : aliceSizes) sumA += a;
        for(int b : bobSizes) sumB += b;

        int diff = (sumA - sumB)/2;

        for(int x : aliceSizes){
            for(int y : bobSizes){
                if(x - y == diff){
                    return new int[]{x,y};
                }
            }
        }
        return new int[]{};
    }
}