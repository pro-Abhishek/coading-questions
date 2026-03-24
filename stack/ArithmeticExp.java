package stack;

import java.util.Stack;
class ArithmeticExp {
    public static int ArithmeticExp(String[] tokens) {
        Stack<Integer> st =  new Stack<>();
        for(String s : tokens){
            switch(s){
               case "+": st.push(st.pop() + st.pop()); break;
               case "*": st.push(st.pop() * st.pop()); break;
               case "-": 
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b-a);
                    break;
               case "/": 
                    int c = st.pop();
                    int d = st.pop();
                    st.push(d/c);
                    break;
               default:
                    st.push(Integer.parseInt(s));     
             }
        }
        int ans = st.peek();
        return ans;
    }

        public static void main(String[] args) {
            String[] tokens = {"2", "1", "+", "3", "*"};
            int result = ArithmeticExp.ArithmeticExp(tokens);
            System.out.println(result); // Output: 9
        }
}
