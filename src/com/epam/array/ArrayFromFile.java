package com.epam.array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ArrayFromFile extends CreateArray{
    String fileName = "dat.txt";
    public int[] arrayFromFile (String fileName) throws IOException {
               BufferedReader reader = new BufferedReader (new FileReader (fileName));
        List<Integer> list = new ArrayList<> ();
        String str;
        while ((str = reader.readLine ()) != null) {
            if (!str.isEmpty () && new ArrayParser ().tryParseInt (str)) {
                {
                    list.add (Integer.parseInt (str));
                }
            }

        }
        int[] array = new int[list.size ()];
        for (int i = 0; i < list.size (); i++) {
            array[i] = list.get (i);
        }
        return array;
    }
}