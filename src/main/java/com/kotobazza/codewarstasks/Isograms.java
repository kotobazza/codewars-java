package main.java.com.kotobazza.codewarstasks;




public class Isograms {
    public static boolean isIsogram(String str){
        str = str.toLowerCase();
        for(char t: str.toCharArray()){
            if(str.indexOf(t) != str.lastIndexOf(t)) return false;
        }
        return true;
    }


}
