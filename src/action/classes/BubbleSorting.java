package action.classes;

import com.epam.array.CreateArray;

import java.util.logging.Logger;

public class BubbleSorting extends CreateArray {
    Logger log = Logger.getLogger(BubbleSorting.class.getName());
    public void bubbleSort(int[] NewArray) {
        for (int i = NewArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (NewArray[j] > NewArray[j + 1]) {
                    int tmp = NewArray[j];
                    NewArray[j] = NewArray[j + 1];
                    NewArray[j + 1] = tmp;
                }
            }
            bubbleSort(NewArray);
            for (int l = 0; i < NewArray.length; l++) {
                log.info (NewArray[i] + "  ");
            }
        }
    }
}
