package main.java.com.kotobazza.codewarstasks;

import java.util.Arrays;

public class ShortestWords {
    public static int findShortestWordLength(String line){
        return Arrays.stream(line.split(" ")).map(String::length).reduce(Integer::min).orElse(Integer.MAX_VALUE);
    }
}
