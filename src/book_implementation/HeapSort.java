package src.book_implementation;
import java.util.*;

public class HeapSort{
    
    public static <E extends Comparable<E>> void heapSort(ArrayList<E> heap){
        for(int i= heap.size() /2; i>=0; i--)
            heapify(heap, i, heap.size());

        //Moving current index (root) to end of heap.
        for(int i=heap.size()-1; i>0; i--){
            // Changing heap values top and 
            E temp = heap.get(0);
            heap.set(0, heap.get(i) );
            heap.set(i, temp);
            
            heapify(heap, 0, i);
        }
        
    }

    /**
     * Fixes the heap
     */
    public static <E extends Comparable<E>> void heapify(ArrayList<E> heap, int index, int size){
        int leftIndex, rightIndex;
        
        while(true){
            leftIndex  = 2*index+1;
            rightIndex = 2*index+2;
            if(leftIndex >= size)
                break;
            int biggestChild;
            if(rightIndex >= size || heap.get(leftIndex).compareTo( heap.get(rightIndex) ) >= 0 ) 
                biggestChild = leftIndex;
            else
                biggestChild = rightIndex;
            if(heap.get(biggestChild).compareTo(heap.get(index)) <= 0)
                break;
            
            E temp = heap.get(index);
            heap.set(index, heap.get(biggestChild) );
            heap.set(biggestChild, temp);
            index = biggestChild;
        }
    }



}
