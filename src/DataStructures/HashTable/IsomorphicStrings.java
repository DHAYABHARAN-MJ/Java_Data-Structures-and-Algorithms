package DataStructures.HashTable;

import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean flag = ssolution.isIsomorphic(s,t);
        System.out.println(flag);
    }
}
class ssolution {
    public  static boolean isIsomorphic(String s, String t) {
        int[] hash1 = new int[256];
        int[] hash2 = new int[256];
        int si = s.length();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0;i<si;i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(hash1[a]!=hash2[b]) return false;
            hash1[a] = i+1;
            hash2[b] = i+1;
        }
        return true;
    }
}