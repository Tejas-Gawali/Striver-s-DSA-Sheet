class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int l  =0 ;
        int sl = 0;
        for(int i = 0 ; i< n ; i++){
            if(arr[i] > l ){
                sl = l;
                l = arr[i];
            }
            else if(arr[i] > sl && arr[i] < l){
                sl = arr[i];
            }
            
        }
        
        if(sl == 0){
            return -1;
        }
        
        return sl;
    }
}
