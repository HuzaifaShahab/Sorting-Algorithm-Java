public class InsertionAlgorithm {
    public static void main(String[] args) {
        int []array = {1,7,3,-1,4,6} ;   // Initialized An Array.

//        Insertion-type of Sorting
        for (int index = 1 ; index < array.length ; index++){  // Outer-Loop.
            int sortedElement = array[index] ;
            int j = index - 1 ;
            while (j>=0 && sortedElement < array[j]){  // Inner-WhileLoop.
                array[j+1] = array[j] ;
                j-- ;
            }
            array[j+1] = sortedElement ;   // Sorted Part || Unsorted Part
        }
       for (int print : array ){             // Enhance foreach loop.
           System.out.print(print + "  ");
       }
    }
}
