//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int s, int mid, int e)
    {
         int mix[] = new int[e-s + 1 ];
         
         int k = 0;
         int i = s;
         int j = mid +1;
         
         while(i <= mid && j <= e){
             if(arr[i] < arr[j]){
                 mix[k++] = arr[i++];
                 
             }
             else{
                 mix[k++] = arr[j++];
                 
             }
             
         }
         
         
         while(i <= mid){
             mix[k++] = arr[i++];
         }
         
         while(j <=e){
             mix[k++] = arr[j++];
         }
         
         for(int l = 0 ; l < mix.length ; l++){
             arr[s+l]  = mix[l];
         }
    }
    void mergeSort(int arr[], int s, int e)
    {
        
        if( s>= e){
            return ;
        }
        
        int mid = (s + e)/2;
        mergeSort(arr, s , mid);
        mergeSort(arr, mid +1 , e);
        merge(arr ,s, mid , e );
        
    }
}
