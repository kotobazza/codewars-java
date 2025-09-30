import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        maskifyTest();
        isIsogramTest();
        numberStringsTest();
    }


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


    public static boolean isIsogram(String str){
        /*Find isometric strings - strings without repeating letters*/
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








    public static String maskify(String str){
        /*Returns maskified value of string of any length.
        Format: ####1234*/
        if(str.length() <= 4) return str;

        return "#".repeat(str.length() - 4) +
                str.substring(str.length() - 4);
    }

    public static void maskifyTest(){
        assert(maskify("1234567890").equals("######7890"));
        assert(maskify("123").equals("123"));
        assert(maskify("").isEmpty());
    }
}