package main.java.com.kotobazza.codewarstasks;

import java.util.TreeMap;

public class PrimeDecomposition {
    public static String factors(int n){
        TreeMap<Integer, Integer> values = new TreeMap<>();

        while(n>1){
            for(int i = 2; i<=n; i++){

                if(n%i==0){
                    n = n/i;
                    if(values.containsKey(i)){
                        values.merge(i, 1, Integer::sum);
                    } else{
                        values.put(i, 1);
                    }
                    break;
                }

            }
        }

        StringBuilder bld = new StringBuilder();

        for(Integer key: values.keySet()){
            bld.append("(");
            bld.append(key.toString());
            if(values.get(key) != 1){
                bld.append("**");
                bld.append(values.get(key).toString());
            }
            bld.append(")");
        }

        return bld.toString();
    }
}
