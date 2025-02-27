package DataStructures.Stack;
/*
735. Asteroid Collision

We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
 */
import java.util.*;
public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] asteroids = new int[n];
        for (int i = 0; i < n; i++) {
            asteroids[i] = sc.nextInt();
        }
        int[] res =  ans(asteroids);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
    public static int[] ans(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids){
            if(a>0){
                stack.push(a);
            }
            else{
                while(!stack.isEmpty()&&stack.peek()>0&& stack.peek()<-a){
                    stack.pop();
                }
                if(stack.isEmpty()|| stack.peek()<0){
                    stack.push(a);
                }
                if(stack.peek()==-a){
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];
        for(int i = res.length-1;i>=0;i--){
            res[i] = stack.pop();
        }
        return res;
    }
}