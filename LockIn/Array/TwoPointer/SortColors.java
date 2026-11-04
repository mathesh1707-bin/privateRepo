//75
package Array.TwoPointer;

class SortColors {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int low=0;int mid=0;int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid++]=arr[low];
                arr[low++]=temp;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[high];
                arr[high--]=arr[mid];
                arr[mid]=temp;
            }
        }
        
    }
}