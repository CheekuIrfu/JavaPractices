package com.irfan.String;

public class GetChars {
        public static void main(String args[]){
            String str = new String("Hi bro how are you fine ?");
            char[] ch = new char[5];
            try{
                str.getChars(7, 12, ch, 0);
                System.out.println(ch);
            }catch(Exception ex){System.out.println(ex);}
        }
}

