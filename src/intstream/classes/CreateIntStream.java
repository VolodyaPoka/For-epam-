package intstream.classes;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.IntStream;

public class CreateIntStream {
    int[] newStream = IntStream.of(1,2,3,4,5,6,7,8,9,10).toArray ();
    public void createIntStream() throws NoSuchAlgorithmException {
        Random rand = SecureRandom.getInstanceStrong();
        for (int i = 0; i < newStream.length; i++){
            newStream[i] = rand.nextInt (10);
        }

    }
}
