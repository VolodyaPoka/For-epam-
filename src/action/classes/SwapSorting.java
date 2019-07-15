package action.classes;

import com.epam.array.CreateArray;

import java.util.logging.Logger;

public class SwapSorting extends CreateArray {
    Logger log = Logger.getLogger(SwapSorting.class.getName());
    public void Swap( int[] NewArray, int i, int j){
        NewArray[i] = (NewArray[i] + NewArray[j]) - (NewArray[j] = NewArray[i]);
        log.info(String.valueOf (NewArray[i]));
        }
    }

