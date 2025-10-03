package com.kotobazza.codewarstasks;

public class Diamond {

    public static String print(int size){
        if(size%2==0||size<0){
            return null;
        }

        StringBuilder bld1 = new StringBuilder();

        for(int i = 0; i< size; i+=2){
            String temp = " ".repeat((size-i)/2) + "*".repeat(i+1) + "\n";
            bld1.append(temp);
        }
        for(int i = size-2; i>=0; i-=2){
            String temp = " ".repeat((size-i)/2) + "*".repeat(i) + "\n";
            bld1.append(temp);
        }

        return bld1.toString();
    }
}
