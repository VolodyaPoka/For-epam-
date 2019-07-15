package action.classes;


import java.util.logging.Logger;


import com.epam.array.CreateArray;

public class Sorting extends CreateArray {
    Logger log = Logger.getLogger(Sorting.class.getName());

    public void printMaxMin() {

        int maximum = 0;
        int minimum = 0;

        int[] array = new int[4];
        for (int i = 0; i < newArray.length; i++) {
            if (minimum > newArray[i]) {

                minimum = newArray[i];
            }
            if (maximum < newArray[i]) {
                maximum = newArray[i];
            }
        }
        log.info("Max = " + maximum);
        log.info ("Min = " + minimum);

    }

}
