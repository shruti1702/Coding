public class serachInRotateSortedArray {

    public static void main(String[] args) {
        int arr[] ={5,6,7,8,9,1,2,3}; 
        int target =6;
        System.out.println(FindPivot(arr));
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = FindPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static int binarySearch (int[] nums,int target,int start , int end) {
        while(start<=end){ 
            int mid= start +(end-start)/2; 
           if(nums[mid]<target){
               start = mid+1;
            }else if(nums[mid]>target)  {
                end=mid-1;
             }else{
                return mid;
            }
        }
       return -1;
    }

    public static int FindPivot(int [] nums){
        int start =0;
        int end= nums.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end =mid-1;
            }
          else{
            start=mid+1;
          }
          
        }
        return -1;
        
    }
}