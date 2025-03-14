package DataStructures.Stack;
import java.util.Stack;
import java.util.Scanner;

public class TheCelebrityProblem {
    static int celebrity(int[][] mat) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

        // Push everybody in stack
        for (int i = 0; i < n; i++)
            st.push(i);

        // Find a potential celebrity
        while (st.size() > 1) {

            int a = st.peek();
            st.pop();

            int b = st.peek();
            st.pop();

            // if a knows b
            if (mat[a][b] != 0) {
                st.push(b);
            }
            else {
                st.push(a);
            }
        }

        // Potential candidate of celebrity
        int c = st.peek();
        st.pop();

        // Check if c is actually
        // a celebrity or not
        for (int i = 0; i < n; i++) {
            if(i == c) continue;

            // If any person doesn't
            // know 'c' or 'c' doesn't
            // know any person, return -1
            if (mat[c][i] != 0 || mat[i][c] == 0)
                return -1;
        }

        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int result = celebrity(mat);
        System.out.println(result);
    }
}
