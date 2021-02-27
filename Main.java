package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<String> words = new ArrayList<>();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter words:");
        String word = myObj.nextLine();
        words.add(word);
        while(!word.equals("")){
            word = myObj.nextLine();
            words.add(word);
        }

        //System.out.println(words.size());
        words.remove(words.size() - 1);
        //System.out.println(words.size());

        ArrayList<String> weakWords = new ArrayList<>();
        for (int i = 0; i < words.size(); ++i) {
            for (int j = 0; j < words.size(); ++j) {
                if(words.get(i).contains(words.get(j)) && !words.get(i).equals(words.get(j))) {
                    int flag = 0;
                    for (int k = 0; k < weakWords.size(); ++k){
                        if(weakWords.get(k).equals(words.get(j))) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag != 1){
                        weakWords.add(words.get(j));
                    }
//                    System.out.println(words.get(j));
                }
            }
        }
//        System.out.println(weakWords);
        for (int i = 0; i < weakWords.size(); ++i){
            System.out.println(weakWords.get(i));
        }
        //System.out.println(words.size());
    }
}
