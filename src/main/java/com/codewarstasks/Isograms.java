package main.java.com.codewarstasks;

/*
* Is this string an isogram?
* Isogram - the string contains symbols meeting only one time in whole string
*       + strings without repeating symbols
*
* */


public class Isograms {

    public static boolean isIsogram(String str){
        str = str.toLowerCase();
        for(char t: str.toCharArray()){
            if(str.indexOf(t) != str.lastIndexOf(t)) return false;
        }
        return true;
    }

    public static void isIsogramTest(){
        assert(isIsogram("Dermatoglyphics"));
        assert(!isIsogram("moose"));

        assert(isIsogram("isogram"));
        assert(isIsogram(""));

    }
}
