package main.java.com.codewarstasks;



public class CamelCaseBreaker {
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
