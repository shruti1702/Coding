/**
 * maxAndmin
 */
public class maxAndmin {

    public static void main(String[] args) {
        int arr []={};
        int n = arr.length;
        
        System.out.println(max(arr,n));
        System.out.println(min(arr,n));
        
    }
    public static int max (int arr[],int n ){
        // int n = arr.length;
        if(n==0){
            return 0;
        }
        int max= Integer.MIN_VALUE;
        
        for(int i =0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[],int n){
        int min= Integer.MAX_VALUE;
        if(n==0){
            return 0;
        }
        for(int i =0;i<n;i++){
            if(min<arr[i]){
                min=arr[i];
            }
        }
        return min;
        
    }
}