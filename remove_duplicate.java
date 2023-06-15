class Solution {
    int remove_duplicate(int A[],int N){
        int k = 1;
        int ele = A[0];
        for(int i = 1 ; i < N  ; i++){
            if(A[i] != ele){
                ele= A[i];
                A[k] = ele;
                k++;
            }
        }
        
        return k;
    }
}
