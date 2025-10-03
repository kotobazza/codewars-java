package com.kotobazza.codewarstasks;


import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/// Given the data stream: `[<8-bytes-1>,<8-bytes-2>,<8-bytes-3>]`
/// Return reversed stream by bytes: `[<8-bytes-3>,<8-bytes-2>,<8-bytes-1>]`
public class ByteStreamReverseTest {
    @Test
    public void testOneByteStream(){
        assertArrayEquals(
                new int[]{1,1,1,1,0,0,0,0},
                ByteStreamReverse.reverseByteStream(new int[]{1,1,1,1,0,0,0,0})
        );

        assertArrayEquals(
                new int[]{1,1,1,1,0,0,0,0},
                ByteStreamReverse.reverseByteStreamUsingMapreduce(new int[]{1,1,1,1,0,0,0,0})
        );

    }

    @Test
    public void testManyBytesStream(){
        assertArrayEquals(
                new int[]{1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},
                ByteStreamReverse.reverseByteStream(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0})
        );
        assertArrayEquals(
                new int[]{1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},
                ByteStreamReverse.reverseByteStreamUsingMapreduce(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0})
        );


    }


    @Test
    public void testNoBytesStream(){
        assertArrayEquals(
                new int[]{},
                ByteStreamReverse.reverseByteStream(new int[]{})
        );
        assertArrayEquals(
                new int[]{},
                ByteStreamReverse.reverseByteStreamUsingMapreduce(new int[]{})
        );
    }

}
