package arrays;

public class PrefixSum {
    public static int[] prefixSum(int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = prefixSum(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
