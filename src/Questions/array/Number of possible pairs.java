package Questions.array;
/* Question: Given an array at size of num which consist of only 3 and 4 , the task is to find number possible conditions,
the conditions are if arr[i]==3 and arr[i+1]==4 then swap the element. The another condition if you already swapped in that index you should again swap that index.
Test case 1:
num = 5
arr = [3,3,4,4]
output: 3
Explanation:
1. At index 1 the num[1] is 3 and next element is 4 so we are swapping and arr changes to  3 4 3 4
2. At index 2 the num[2] is 3 and next element is 4 so we are swapping and arr changes to 3 4 4 3
3. At index 0 the num[0] is 3 and next element is 4 so we are swapping and arr changes to 4 3 4 3
4. Now we can't swap arr[1] and arr[2] because it is index 1 is already visited

PS: The question is asked in accenture OA.
 */

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int pairs = solutions.possiblepairs(n,arr);
        System.out.println(pairs);
    }
}
class solutions {
    public static int possiblepairs(int n, int[] arr) {
        int count = 0;
        int[] check = new int[n];
        ;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 3 && arr[i + 1] == 4 && check[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                    count++;
                    check[i] = 1;
                }
            }
        }
        return count;
    }
}
