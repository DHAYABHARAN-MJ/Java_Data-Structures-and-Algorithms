package DataStructures.String;

import java.util.*;
class sc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = stringDeCompress(s);
        System.out.println(res);
    }
    public static String stringDeCompress(String s){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length()-1; i=i+2){
            char ch = s.charAt(i);
            int val = s.charAt(i+1)-'0';
            while(val>0){
                res.append(ch);
                val--;
            }
        }
        return res.toString();
    }
}