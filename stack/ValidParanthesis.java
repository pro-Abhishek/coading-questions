import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

class ValidParanthesis {
    public static boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char ele = st.peek();
                if (map.get(ele).equals(c)) st.pop();
                else return false;
            }
        }
        return st.isEmpty(); 
    }
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValid(s));
    }
}
