package recursion;
import java.util.ArrayList;
import java.util.List;

public class permutations {

  public static List<List<Integer>> permute(int nums[], List<Integer> ds, List<List<Integer>> ans,  boolean freq[]) {
    if (ds.size() == nums.length) {
      ans.add(new ArrayList<Integer>(ds));
      return ans;
    }
    for (int i = 0; i < nums.length; i++) {
      if (ds.contains(nums[i])) continue;
      ds.add(nums[i]);
      freq[i] = true;
      permute(nums, ds, ans, freq);
      ds.remove(ds.size() - 1);
      freq[i] = false;
    }
    return ans;
  }

  public static void main(String[] args) {
    int nums[] = {1, 2, 3};
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();
    boolean freq[] = new boolean[nums.length];
    permute(nums, ds, ans, freq);
    System.out.println(ans);
  }    
}