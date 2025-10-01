package main.java.com.codewarstasks;




public class Isograms {
    /**
     * Is this string an isogram?
     * Isogram - the string contains symbols meeting only one time in whole string
     *       + strings without repeating symbols
     * */
    public static boolean isIsogram(String str){
        str = str.toLowerCase();
        for(char t: str.toCharArray()){
            if(str.indexOf(t) != str.lastIndexOf(t)) return false;
        }
        return true;
    }


}
