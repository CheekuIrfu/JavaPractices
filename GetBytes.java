package com.irfan.String;

public class GetBytes {
        public static void main(String args[]){
            String s1="BRATHWAITE";
            byte[] barr=s1.getBytes();
            for(int i=0;i<barr.length;i++){
                System.out.println(barr[i]);
            }
        }
}

