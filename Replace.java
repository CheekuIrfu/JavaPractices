package com.irfan.String;

public class Replace {
        public static void main(String args[]){
            String s1="The word is king we remember the player called virat kohli";
            String replaceString=s1.replace("is","called");//replaces all occurrences of "is" to "was"
            System.out.println(replaceString);
        }
}

