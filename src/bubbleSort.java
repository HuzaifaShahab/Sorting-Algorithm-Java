public class bubbleSort {
    public static void main(String[] args) {

        int [] array = {4,5,6,3,2,1} ;  // Initialized An Array.

//        Bubble Sort Practice Session !

        for (int index = 0 ; index < array.length - 1 ; index++){  // Outer-loop will iterate 5 times.

            for (int j = 0 ; j < array.length-index-1 ; j++ ){  // Inner-loop logic

                if (array[j] > array[j+1]){
//                                                 This is Swapping without a third variable.
                    array[j] = array[j]*array[j+1] ;
                    array[j+1] = array[j]/array[j+1] ;
                    array[j] = array[j]/array[j+1] ;

                }
            }
        }

        for(int index = 0 ; index < array.length ; index++){ // You can also use an enhance for-each loop.
            System.out.print(array[index] + " ");
        }

    }
}