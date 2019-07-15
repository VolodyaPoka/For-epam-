package action.classes;

import com.epam.array.CreateArray;

import java.util.logging.Logger;

public class Sum extends CreateArray {
    Logger log = Logger.getLogger(Sum.class.getName());
    public void sum(){
            int sum = 0;
            for(int i = 0; i < newArray.length; i++) {
                sum += newArray[i];
            }
            log.info(String.valueOf (sum));
        }

    }

