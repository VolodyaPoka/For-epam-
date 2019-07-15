package intstream.classes;

import java.util.stream.IntStream;

public class FindAverage extends CreateIntStream {
    public double findaverage(int[] newStream){
       return IntStream.of (newStream).average ().getAsDouble ();

    }
}
