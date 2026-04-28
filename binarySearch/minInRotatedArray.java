package binarySearch;

public class minInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        minInRotatedArray solution = new minInRotatedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.findMin(nums)); // Output: 0
    }
}
