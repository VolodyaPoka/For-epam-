package com.epam.array;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

public class ReadArray {
    Logger log = Logger.getLogger (CreateArray.class.getName ());

    public void reader() {
        try {
            List<String> lines = Files.readAllLines (Paths.get ("dat.txt"), StandardCharsets.UTF_8);
            for (String line : lines) {
                log.info (line);
            }
        } catch (Exception e) {
            log.info (e.toString ());
        }
    }
}
