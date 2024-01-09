/* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. */
public class containDupe {
    //Drivers code
    public static void main(String args[]){
        int [] arr = {3, 4, 5, 8, 2};
        System.out.println(dupe(arr));
    }
    //Function to find duplicates
    static boolean dupe(int a[]){
        int size = a.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;

    }
}
