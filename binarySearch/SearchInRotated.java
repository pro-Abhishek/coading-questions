package binarySearch;
public class SearchInRotated {
    public static int search(int[] nums, int target) {
       int n = nums.length;
       int l = 0;
       int r = n - 1;
       if(nums.length == 1 && nums[0] == target) return 0;
       while(l <= r){
        int mid = l + (r-l)/2;
        if(nums[mid] == target) return mid;
        
        if(nums[mid] >= nums[l]){
          if(nums[mid] > target && nums[l] <= target){
            r = mid - 1;
          }else{
            l = mid + 1;
          }
        }else{
          if(nums[mid] < target && nums[r] >= target){
            l = mid + 1;
          }else{
            r = mid - 1;
          }
        }
       }
       return -1;
    }
    public static void main(String args[]){
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(SearchInRotated.search(nums,4));
    }
}