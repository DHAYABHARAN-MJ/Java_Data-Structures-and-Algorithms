package DataStructures.String;

import java.util.*;
class CountOfWordsGivenInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = sc.nextLine();
        int count = 0;
        int ind = s.indexOf(word);
        while(ind!=-1){
            count++;
            ind = s.indexOf(word, ind+word.length());
        }
        System.out.println(count);
    }
}