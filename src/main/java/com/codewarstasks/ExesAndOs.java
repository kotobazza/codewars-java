package main.java.com.codewarstasks;

/*
* check is string containing the equal number of 'x's and 'o's
* */

public class ExesAndOs {
    public static boolean exesAndOs(String str){
        str = str.toLowerCase();
        return str.chars().filter(x -> x == 'x').count() == str.chars().filter(x -> x == 'o').count();
    }






}
