package main.java.com.codewarstasks;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FindUnique {
    public static double findUniqByTreeMap(double[] values){
        TreeMap<Double, Integer> map = new TreeMap<>();

        for (double value : values) {
            if (map.containsKey(value)) map.merge(value, 1, Integer::sum);
            else map.put(value, 1);
        }

        for(Double key:map.keySet())
            if (map.get(key) == 1) {
                return key;
            }
        return 0;

    }

    public static double findUniqueByTwoLists(double[] values){
        List<Double> metFirstTime = new ArrayList<>();
        List<Double> metManyTimes = new ArrayList<>();

        for(Double val: values){
            if(!metFirstTime.contains(val) && !metManyTimes.contains(val)){
                metFirstTime.add(val);
            } else if (metFirstTime.contains(val)){
                metFirstTime.remove(val);
                metManyTimes.add(val);
            }
        }

        return metFirstTime.get(0);
    }
}
