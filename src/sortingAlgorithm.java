public class sortingAlgorithm {
    public static void main(String[] args) {

        System.out.println("Array Sorting Algorithm-Concept Catching !");

        int []array = {9,8,7,4,3,3,2,1} ;   // Initialized An Array.

        int startLoop , minValue , minIndex ;    // Declared Variables.
        for (startLoop = 0 ; startLoop < array.length-1 ; startLoop++) { // Outer-Loop.
            minIndex = startLoop ;
            minValue = array[minIndex] ; // [0] index will got incremented tbt.

            for (int index = startLoop + 1 ; index < array.length ; index++) { // Inner-Loop.
                if (array[index] < minValue){
                    minValue = array[index] ;
                    minIndex = index ;
                }
            }
            array[minIndex] = array[startLoop] ; // Putting Values For Sorting An Array.
            array[startLoop] = minValue ;
        }

        for (int i = 0 ; i < array.length ; i++){ // You can use an enhance for-each loop also.
            System.out.print(array[i]+" ");
        }
    }
}
