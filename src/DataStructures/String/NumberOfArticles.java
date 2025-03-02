package DataStructures.String;

import java.util.*;
public class NumberOfArticles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int n =0;
        Set<String> set = new HashSet<>();
        set.add("the");
        set.add("an");
        set.add("a");
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            String temp = arr[i].toLowerCase();
            if(set.contains(temp)){
                count++;
            }
        }
        System.out.println(count);
    }
}
