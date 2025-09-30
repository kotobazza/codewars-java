//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        maskifyTest();

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