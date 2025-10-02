package main.java.com.kotobazza.codewarstasks;

import java.util.stream.IntStream;

public class ByteStreamReverse {

    public static int[] reverseByteStream(int[] data){
        int[] result = new int[data.length];
        for(int i = 0; i<data.length/8; i++){
            for(int j =0; j<8; j++){
                int mainIndex = i*8+j;
                int revIndex = (data.length/8-i-1)*8+j;
                result[mainIndex] = data[revIndex];
            }
        }

        return result;
    }


    /// uses magic of map-reduce
    public static int[] reverseByteStreamUsingMapreduce(int[] data){

        return IntStream.range(0, data.length / 8)
                .flatMap(i -> IntStream.range(0, 8)
                .map(j -> data[(data.length / 8 - 1 - i) * 8 + j]))
                .toArray();
    }
}
