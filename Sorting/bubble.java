import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble {
    
    public static void main(String[] args) {
         int[] arr ={5,9,4,9,3,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the step n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            // fro each step , max item will come at the last respective inde
            for( int j=1;j<arr.length;j++){
                // swap if the item is smaller than the previous item
                if(arr[j]< arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i , it means the array i s sored hence stop the 
            if(!swapped){
                break;
            }
        }
    }
}
