import java.util.Arrays;

/**
 * chocalatedistribution
 */
public class chocalatedistribution {

    public static void main(String[] args) {
        int [] arr ={ 2,4,5,6,7,86,54,34};
        int m =4;
        System.out.println(MinDiff(arr, m));
    }

    public static int MinDiff(int []arr,int m) {
        int n =arr.length;
        Arrays.sort(arr);
        if(m>n){
            return -1;
        }
        if(m== 0 || n == 0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int i =0;i+m-1<n;i++){
            int diff = arr[i+m-1]-arr[i];
            if(min>diff){
                min=diff;
            }
        }
        return min;

        
    }
}
