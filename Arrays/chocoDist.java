/* Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 
Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
return Minimum difference between maximum and minimum chocolates.*/
import java.util.*;
public class chocoDist {
    //Driver's code
    public static void main(String args[]){
        int [] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        int value = chocolateDist(arr,m);
        if(value == 0){
            System.out.println("Invalid inputs");
        }
        else{
            System.out.println("Difference: "+ value);
        }
    }
    //Function for chocolate distribution
    static int chocolateDist(int a[], int m){
        int diff = Integer.MAX_VALUE;
        int size = a.length;
        //base conditions
        if(size == 0 || m == 0){
            return 0;
        }

        //sort array
        Arrays.sort(a);

        //not enough packets
        if(m > size-1){
            return -1;
        }

        for(int i=0;i<size;i++){
            int lastPacket = i+m-1;
            if(lastPacket >= size){
                break;
            }
            int currDiff = a[lastPacket] - a[i];
            diff = Math.min(diff,currDiff);
        }
        return diff;
    }
}
