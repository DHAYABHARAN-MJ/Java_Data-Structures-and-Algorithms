package DataStructures.HashTable;
/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */
import java.util.*;
class uniqueNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = Soliton.uniqueOccurrences(arr);
        System.out.println(flag);
    }
}
class Soliton {
    public  static boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> hs = new HashSet<>();
        for(int value: hm.values()){
            hs.add(value);
        }
        return hm.size()==hs.size();
    }
}