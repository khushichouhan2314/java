class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //n=3 and first element and last element cant be peak 
        int n = arr.length;
        int low = 1;
        int high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]) return mid;
            else if (arr[mid]> arr[mid-1] && arr[mid]<arr[mid+1] )low = mid+1;
            else high = mid-1;// decreasing side
        }

        return -1;


        
    }
}