import java.util.*;
class permutationInString {
    public static boolean isPermutation(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int first[] = new int[26];
        int second[] = new int[26];
        int l = 0;
        int r = 0;
        for(int i=0;i<s1.length();i++){
            first[s1.charAt(i)-'a']++;
        }
        while(r < s1.length()){
            second[s2.charAt(r)-'a']++;
            r++;
        }
        r = s1.length() - 1;  // r to fix at the end of the window;
        while(r < s2.length()){
            if(Arrays.equals(first,second)) return true;
            second[s2.charAt(l)-'a']--;
            r++;
            l++;
            if(r < s2.length()) {
                second[s2.charAt(r) - 'a']++; // Add new right character
            }
        }
        return false;  
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(isPermutation(s1, s2));
    }
}

