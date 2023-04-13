
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,7,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection (int arr[]) {
        int n =arr.length;
        for(int i =0;i<arr.length;i++){
            int last = n-i-1;
            int m = max(arr,0,last);
            swap(arr,m,last);
        }
        
    }
    public static void swap(int arr[],int first, int last) {
        int temp;
        temp=arr[first];
        arr[first]=arr[last];
        arr[last] =temp;
    }


    public static int max(int []arr,int start,int last) {
        int max =start;
        for (int i = 1; i <=last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
            
        }
        return max;
        
    }
}
