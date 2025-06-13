class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low  =0;
        int high  = arr.length;
        while( low < high){
            int mid =   (low + high)/2;
            int missing  = arr[mid] - (mid + 1);

            if(missing < k){
                low  =mid + 1;
            }else{
                high = mid;
            }
        }
        return low + k;
    }
}