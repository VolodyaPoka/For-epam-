package intstream.classes;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class ReadIntStream {
    Logger log = Logger.getLogger(ReadIntStream.class.getName());
    public void readIntStream(){
        try (
                Stream<String> str = Files.lines (Paths.get ("dat.txt"))) {
            String[] lines = str.toArray (String[]::new);
            for (String line : lines){
                log.info(line);
            }
        }
        catch (Exception e){
            log.info(String.valueOf (e));
        }
    }
}