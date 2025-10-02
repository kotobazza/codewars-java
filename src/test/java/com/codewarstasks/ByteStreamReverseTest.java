package test.java.com.codewarstasks;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static main.java.com.codewarstasks.ByteStreamReverse.reverseByteStream;
import static main.java.com.codewarstasks.ByteStreamReverse.reverseByteStreamUsingMapreduce;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/// Given the data stream: `[<8-bytes-1>,<8-bytes-2>,<8-bytes-3>]`
/// Return reversed stream by bytes: `[<8-bytes-3>,<8-bytes-2>,<8-bytes-1>]`
public class ByteStreamReverseTest {
    @Test
    public void testOneByteStream(){
        assertArrayEquals(
                new int[]{1,1,1,1,0,0,0,0},
                reverseByteStream(new int[]{1,1,1,1,0,0,0,0})
        );

        assertArrayEquals(
                new int[]{1,1,1,1,0,0,0,0},
                reverseByteStreamUsingMapreduce(new int[]{1,1,1,1,0,0,0,0})
        );

    }

    @Test
    public void testManyBytesStream(){
        assertArrayEquals(
                new int[]{1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},
                reverseByteStream(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0})
        );
        assertArrayEquals(
                new int[]{1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},
                reverseByteStreamUsingMapreduce(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0})
        );


    }


    @Test
    public void testNoBytesStream(){
        assertArrayEquals(
                new int[]{},
                reverseByteStream(new int[]{})
        );
        assertArrayEquals(
                new int[]{},
                reverseByteStreamUsingMapreduce(new int[]{})
        );
    }

}
