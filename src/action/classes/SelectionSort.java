package action.classes;

import com.epam.array.CreateArray;

import java.util.logging.Logger;

public class SelectionSort extends CreateArray {
    Logger log = Logger.getLogger(SelectionSort.class.getName());
    public void selectionSort(int[] NewArray){
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < NewArray.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = NewArray[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < NewArray.length; j++) {
                //Если находим, запоминаем его индекс
                if (NewArray[j] < min) {
                    min = NewArray[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = NewArray[i];
                NewArray[i] = NewArray[min_i];
                NewArray[min_i] = tmp;
            }
        }
        selectionSort(NewArray);
        for(int i = 0; i < NewArray.length; i++) {
           log.info(NewArray[i] + "  ");
        }
    }
}
