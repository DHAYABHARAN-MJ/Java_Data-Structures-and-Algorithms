package math;

import java.util.ArrayList;
import java.util.Scanner;
class answer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        ArrayList<Integer> list = SelfDivNum(left,right);
        System.out.println(list);
    }
    public static ArrayList<Integer> SelfDivNum(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(check(i)) list.add(i);
        }
        return list;
    }
    public static boolean check(int num) {
        int temp = num;
        while (temp > 0) {
            int remainder = temp % 10;
            if( remainder==0 || num%remainder != 0) return false;
            temp /= 10;
        }
        return true;
    }
}