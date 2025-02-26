package DataStructures.HashTable;/*
Check if an array is subset of another array
Given two arrays a[] and b[] of size m and n respectively, the task is to determine whether b[] is a subset of a[]. Both arrays are not sorted, and elements are distinct.

Examples:
Input: a[] = [11, 1, 13, 21, 3, 7], b[] = [11, 3, 7, 1]
Output: true

Input: a[]= [1, 2, 3, 4, 5, 6], b = [1, 2, 4]
Output: true

Input: a[] = [10, 5, 2, 23, 19], b = [19, 5, 3]
Output: false
 */
import java.util.*;
class subset
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        boolean flag = Solution.isSubset(arr1,arr2);
        System.out.println(flag);
}
}
class Solution {
    public static boolean isSubset(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n1;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<n2;i++){
            if(hm.containsKey(b[i])&&hm.get(b[i])>0){
                hm.put(b[i],hm.getOrDefault(b[i],0)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
