package com.kotobazza.codewarstasks;

public class SimpleCypher1 {

    public static String encrypt(String input){
        StringBuilder bld = new StringBuilder();

        String[] words = input.split(" ");

        for(int i = 0; i< words.length; i++){
            String v = words[i];
            if(!v.isEmpty()){
                bld.append(v.codePointAt(0));
            }
            if(v.length() == 2){
                bld.append(Character.toChars(v.codePointAt(1)));
            } else  if (v.length() > 2){
                bld.append(Character.toChars(v.codePointAt(v.length()-1)));
                bld.append(v, 2, v.length()-1);
                bld.append(Character.toChars(v.codePointAt(1)));
            }

            if(i != words.length-1){
                bld.append(" ");
            }
        }
        return bld.toString();
    }

    /// wasn't implemented due to no task on CodeWars for Java
    @Deprecated
    public static String decrypt(String input){
        return input;
    }

}
