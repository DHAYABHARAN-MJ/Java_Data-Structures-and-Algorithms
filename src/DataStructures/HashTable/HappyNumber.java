package DataStructures.HashTable;

import java.util.*;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isSolution.isHappy(n));
    }
}
class isSolution {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int num = n;
        while(!set.contains(num)){
            set.add(num);
            int temp = num;
            int  res = 0;
            while(temp!=0){
                int ans = temp%10;
                res = res+ ans*ans;
                temp/=10;
            }
            num = res;
            if(num==1) return true;
        }
        return false;
    }
}