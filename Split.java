package com.irfan.String;

public class Split {
        public static void main(String args[]){
            String s1="Happy to see you bro";
            System.out.println("returning words:");
            for(String w:s1.split("\\s",0)){
                System.out.println(w);
            }
            System.out.println("returning words:");
            for(String w:s1.split("\\s",1)){
                System.out.println(w);
            }
            System.out.println("returning words:");
            for(String w:s1.split("\\s",2)){
                System.out.println(w);
            }

        }
}

