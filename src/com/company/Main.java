package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        int size = 100;
        ArrayList<Integer> listTwo = new ArrayList<>();
        int[] list = {15, 9, 8, 1, 4, 11, 7, 12, 13, 6, 5, 3, 16, 2, 10, 14};
        int value;
        Random rand = new Random();
        Set<Integer> set = new HashSet<Integer>();

        // hm not randomized
        while (set.size() != size) {
            set.add(rand.nextInt(size + 1));
        }

        listTwo.addAll(set);

        for (int i : listTwo) {
            System.out.println(i);
        }

        //Bubble Sort


        for (int i : list){
            System.out.println(i);
        }
    }
}
