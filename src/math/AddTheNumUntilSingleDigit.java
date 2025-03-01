package math;

import java.util.*;
class ans{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = AddTheNumSingleDigit(num);
        System.out.println(ans);
    }
    public static int AddTheNumSingleDigit(int num){
        while(num>9){
            int temp = num,res =0;
            while (temp>0){
                int digit = temp%10;
                res  = res + digit;
                temp = temp/10;
            }
            num = res;
        }
        return num;
    }
}