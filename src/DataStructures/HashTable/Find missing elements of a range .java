package DataStructures.HashTable;

import java.util.*;
class Missingnumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        int low = sc.nextInt();
        int high = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        al = solution(n1,arr1,low,high);
        System.out.println(al);
    }
    public static ArrayList<Integer> solution(int n1, int[] arr1, int low, int high){
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<n1; i++){
            hm.put(arr1[i],1);
        }
        for(int i=low; i<=high; i++){
            if(!hm.containsKey(i)){
                al.add(i);
            }
        }
        return al;
    }
}