class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high )/2;
            if(arr[mid]==target){
                return mid;
            }

            else if (arr[low]<=arr[mid]){ //left half is sorted
            if(arr[low]<= target && arr[mid]> target) high = mid-1; // l<tar<m
            else low= mid+1;
           

            }
            else{
                if(arr[mid]< target && arr[high]>=target) low = mid+1; // m<t<h
                else high = mid-1;
            }
        }

return -1;
        
    }
}