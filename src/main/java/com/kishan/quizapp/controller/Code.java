package com.kishan.quizapp.controller;
import java.util.*;

public class Code {
    public static void duplicates(String str){
        Map<Character,Integer> mp=new HashMap<>();
        int n=str.length();
        String s=str.toLowerCase();


        for(int i=0;i<n;i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
            }
            else{
                mp.put(str.charAt(i),1);
            }
        }
        Set<Character> st=new HashSet<>();
        System.out.println();

    }
    public static void main(String[] args) {
        String ans="My name is Kishan Verma";
        duplicates(ans);
    }

}
