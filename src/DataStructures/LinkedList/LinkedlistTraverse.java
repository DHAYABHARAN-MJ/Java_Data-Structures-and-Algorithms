package DataStructures.LinkedList;

import java.util.*;
class Linkedist{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i : list){
            System.out.println(i);
        }
    }
}