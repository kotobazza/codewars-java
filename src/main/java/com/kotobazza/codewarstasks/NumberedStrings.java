package com.kotobazza.codewarstasks;

import java.util.ArrayList;
import java.util.List;



public class NumberedStrings {
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