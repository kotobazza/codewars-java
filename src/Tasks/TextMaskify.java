package Tasks;

/*
* Create maskified text
*     + all characters replaced with '#'
*     + last 4 symbols still visible
*     + in <4 - everything is visible
* */



public class TextMaskify {
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
