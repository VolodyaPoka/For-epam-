package intstream.classes;

import java.util.stream.IntStream;

public class FindMinMax extends CreateIntStream{
    public int maxArray(int[] newStream) {
        return IntStream.of(newStream).max().getAsInt();
    }
    public int minArray(int[] newStream){
        return IntStream.of(newStream).min().getAsInt();
    }
}
