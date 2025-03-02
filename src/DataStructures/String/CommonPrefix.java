package DataStructures.String;

import java.util.*;
public class CommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        Arrays.sort(str);
        String prefix = "";
        String fw = str[0];
        String lw= str[n-1];
        for(int i =0;i<fw.length()&& i<lw.length();i++){
            if(fw.charAt(i)==lw.charAt(i)){
                prefix = prefix + fw.charAt(i);
            }
        }
        System.out.println(prefix);
    }

}