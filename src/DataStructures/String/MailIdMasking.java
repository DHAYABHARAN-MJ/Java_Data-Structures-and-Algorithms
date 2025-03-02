package DataStructures.String;

import java.util.*;
public class MailIdMasking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = -1;
        String mask = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                index=i;
                break;
            }
        }
        mask = mask+str.charAt(0);

        for(int i =1;i<index-1;i++){
            mask = mask+'*';
        }
        for(int i=index+1;i<str.length();i++){
            mask = mask+str.charAt(i);
        }
        System.out.println(mask);
    }
}