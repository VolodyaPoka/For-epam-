package com.epam.array;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;


public class CreateArray {
    public int[] newArray = new int[10];
    public void createArray() throws NoSuchAlgorithmException {
    Random rand = SecureRandom.getInstanceStrong();
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = rand.nextInt(10);
        }
    }
}




