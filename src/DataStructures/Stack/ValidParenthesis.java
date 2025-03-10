package DataStructures.Stack;

import java.util.*;
class ValidParenthesis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Soluti.isValid(s));
    }
}
class Soluti {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()
        ) {

            if(x=='('){

                stack.push(')');
            } else if (x=='{') {
                stack.push('}');

            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {

                return false;
            }

        }


        return stack.isEmpty();

    }
}