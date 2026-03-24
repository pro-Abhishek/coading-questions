package stack;

import java.util.Stack;

class DailyTempreture {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int res[] = new int[n];
        Stack<int[]> s = new Stack<>();
        for(int i = 0;i < n; i++){
          int t = temperatures[i];  
          while(!s.isEmpty() && s.peek()[0] < t){
             int pair[] = s.pop();
             int ele = pair[0];
             int eleInd = pair[1];
             res[eleInd] = i - eleInd;
          }
          s.push(new int[]{temperatures[i],i});
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        for (int r : result) {
            System.out.print(r + " ");
        }
        // Output: [1, 1, 4, 2, 1, 1, 0, 0]
    }

}
