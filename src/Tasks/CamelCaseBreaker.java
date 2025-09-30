package Tasks;

import java.util.ArrayList;

public class CamelCaseBreaker {

    public static String breakCamelCase(String str){
        StringBuilder bld = new StringBuilder();
        for(int i = 0; i< str.length(); i++){
            char t = ((char) str.codePointAt(i));
            if(Character.isUpperCase(t) && bld.length() > 0){
                bld.append(" ");
            }
            bld.appendCodePoint(t);
        }
        return bld.toString();
    }


    public static void  breakCamelCaseTest(){
        assert("Insomnia".equals(breakCamelCase("Insomnia")));
        assert("camel Case".equals(breakCamelCase("camelCase")));
        assert("camel Casing Test".equals(breakCamelCase("camelCasingTest")));
        assert("camelcasingtest".equals(breakCamelCase("camelcasingtest")));
    }
}
