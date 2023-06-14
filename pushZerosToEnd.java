

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int i = 0;
        for(int num:arr){
            if(num != 0 ){
                arr[i] = num;
                i++;
            }
        }
        
        while(i < n){
            arr[i] = 0;
            i++;
        }
    }
}
