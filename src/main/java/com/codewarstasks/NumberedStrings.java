package main.java.com.codewarstasks;

import java.util.ArrayList;
import java.util.List;



public class NumberedStrings {

    /**
     * Given the array of strings, concatenate each string with its number like "1: <string>"
     * */

    public static List<String> numberStrings(List<String> lines){
        List<String> result = new ArrayList<>();
        for(int i = 0; i<lines.size(); i++){
            String bld = i+1 +
                    ": " +
                    lines.get(i);
            result.add(bld);
        }

        return result;
    }


}