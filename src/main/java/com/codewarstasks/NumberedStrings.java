package main.java.com.codewarstasks;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void numberStringsTest(){
        assert(List.of().equals(numberStrings(List.of())));

        assert(Arrays.asList("1: a", "2: b", "3: c").equals(numberStrings(Arrays.asList("a", "b", "c"))));

        assert(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: ").equals(numberStrings(Arrays.asList("", "", "", "", ""))));
    }
}