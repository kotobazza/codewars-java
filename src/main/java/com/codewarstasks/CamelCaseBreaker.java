package main.java.com.codewarstasks;



public class CamelCaseBreaker {

    /**
     * break string in camel case on each Upper Letter
     * */
    public static String breakCamelCase(String str){
        StringBuilder bld = new StringBuilder();
        for(int i = 0; i< str.length(); i++){
            char t = ((char) str.codePointAt(i));
            if(Character.isUpperCase(t) && bld.length() > 0){
                bld.append(" ");
            }
            bld.appendCodePoint(t);
        }
        return bld.toString();
    }



}
