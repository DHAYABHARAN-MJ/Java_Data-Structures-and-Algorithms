package Algorithms.Searching;

import java.util.Scanner;
public class FindTheInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int ans = Answer.searchInsertK(arr,N,k);
        System.out.println(ans);
    }
}
class Answer
{
    static int searchInsertK(int arr[], int n, int k)
    {
        int left = 0;
        int right = n-1;
        int index = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k) right = mid-1;
            else{
                left = mid +1;
                index = mid;
            }
        }
        return left;
    }
}