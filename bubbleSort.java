import java.util.Arrays;

class Main {

  // perform the bubble sort
  static void bubbleSort(int array[]) {
    int size = array.length;
    boolean swapped;
    // loop to access each array element
    for (int i = 0; i < (size-1); i++) {
      for (int j = 0; j < (size-i-1); j++) {
        if (array[j] > array[j + 1]) {

          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = true;
        }
      }
      
    }
  }

  
}