package DataStructures.String;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1=sc.nextInt();
        int i2=sc.nextInt();
        int i3=sc.nextInt();
        String res = solutions.ans(i1,i2,i3);
        System.out.println(res);
    }
}
class solutions{
    public static String ans(int i1,int i2,int i3){
        StringBuffer sb = new StringBuffer();
        int ans = i2*i2-4*i1*i3;
        if(ans>=0) {
            sb.append(" is real and positive roots");
        }
        else{
            sb.append(" is imaginary and negative roots");
        }
        String s = "Discriminant:";
        s = s+ans;
        s = s + sb.toString();
        return s;
    }
}
