/*Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons. */
import java.util.*;
public class MinMaxEle{
    public static void main(String args[]){

        // get the inputs from user
        System.out.println("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the elements: ");
        for (int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }

        //sort the array
        Arrays.sort(arr);

        //get values
        int min = arr[1];
        int max = arr[n-1];

        //print the elements
        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);
    }
}