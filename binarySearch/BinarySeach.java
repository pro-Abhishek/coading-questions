package binarySearch;
class BinarySearch {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r ){
            int m = (l + r) / 2;
            if(nums[m] > target) r = m - 1;
            else if(nums[m] < target) l = m + 1;
            else return m;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
