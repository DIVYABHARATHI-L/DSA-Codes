/*Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. (Kadane’s Algorithm)  */
public class maxSubArr {
    //Drivers code
    public static void main(String args[]){
        int [] arr = {-7, -3, 4, -5, -2, 9, 5, -3 };
        System.out.println("Maximum contagious sum: "+ maxSumArr(arr));
    }
    //function for Kadane's Algorithm
    static int maxSumArr(int a[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int size = a.length;
        for(int i=0;i<size;i++){
            currSum = currSum + a[i];
            if(maxSum < currSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;

    }
}
