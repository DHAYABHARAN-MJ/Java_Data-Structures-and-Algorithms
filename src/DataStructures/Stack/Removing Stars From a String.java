package DataStructures.Stack;

import java.util.*;
class Remove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = ion.removeStars(str);
        System.out.println(res);
    }
}
class ion {
    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();
        String res = "";
        for(int i =0;i<len;i++){
            if(s.charAt(i)=='*'&& !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            res = st.pop()+ res;
        }
        return res;
    }
}