/*Given an array (or string), the task is to reverse the array/string. */
import java.util.*;

public class RevArr {
    static void revArr(int arr[], int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void prntArr(int arr[], int size){
        for (int i=0; i<size-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int array[] = {85, 65, 5, 87, 22};
        System.out.print("Array: ");
        prntArr(array,5);
        revArr(array,0,4);
        System.out.print("Reverse Array: ");
        prntArr(array,5);
    }
}
