package stack;
import java.util.ArrayList;
class MinStack {
    ArrayList<Integer> list;
    ArrayList<Integer> minValue;

    public MinStack() {
        list = new ArrayList<>();
        minValue = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        if(!minValue.isEmpty()){
           int m = Math.min(val, minValue.get(minValue.size()-1)) ;
           minValue.add(m);
        }else{
           minValue.add(val); 
        }
    }
    
    public void pop() {
        list.remove(list.size()-1);
        minValue.remove(minValue.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        int mini = minValue.get(minValue.size()-1);
        return mini;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
