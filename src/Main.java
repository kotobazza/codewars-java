//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        maskifyTest();

    }








    public static String maskify(String str){
        /*Returns maskified value of string of any length.
        Format: ####1234*/
        if(str.length() <= 4){
            return str;
        }
        StringBuilder bld = new StringBuilder();
        bld.repeat("#", str.length()-4);
        bld.append(str.substring(str.length()-4));
        return bld.toString();
    }

    public static void maskifyTest(){
        assert(maskify("1234567890").equals("######7890"));
        assert(maskify("123").equals("123"));
        assert(maskify("").isEmpty());
    }
}