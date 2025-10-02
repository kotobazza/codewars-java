package main.java.com.kotobazza.codewarstasks;



public class SimpleCypher2 {

    public static String encrypt(String input, final int times){
        for(int i = 0; i< times; i++){
            StringBuilder bld = new StringBuilder();
            StringBuilder bld2 = new StringBuilder();
            for(int j = 0; j<input.length(); j++){
                if(j%2==0){
                    bld.append(input.charAt(j));
                } else{
                    bld2.append(input.charAt(j));
                }
            }

            bld2.append(bld);
            input = bld2.toString();
        }
        return input;
    }

    public static String decrypt(String input, final int times){
        for(int i = 0; i<times; i++){
            String odd = input.substring(0, input.length()/2);
            String even = input.substring(input.length()/2);
            StringBuilder bld = new StringBuilder();
            for(int j = 0; j < input.length(); j++){
                if(j %2==0){
                    bld.append(even.charAt(j/2));
                } else{
                    bld.append(odd.charAt(j/2));
                }
            }
            input = bld.toString();
        }
        return input;

    }
}
