package action.classes;

import com.epam.array.CreateArray;



public class MiddleSorting extends CreateArray {
    public void MiddleSoting(){
        double middle = 0;
        if (newArray.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < newArray.length; j++) {
                sum += newArray[j];
            }
            middle = sum / newArray.length;
        }
    }

}
