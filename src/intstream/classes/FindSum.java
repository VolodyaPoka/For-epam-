package intstream.classes;

import java.util.stream.IntStream;

public class FindSum extends CreateIntStream {
    public int findsum(int[] newStream){
        return (IntStream.of(newStream).sum());
    }
}
