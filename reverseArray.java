
public class reverseArray {

    public static void main(String[] args) {
        int nums[]={1,23,34,45,5,8};
        reverse(nums);
    }
    public static void reverse(int nums[]) {
        int n =nums.length;
        int temp;
       
       
          for(int i =0; i<n/2;i++){
            temp = nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=temp;
        }
        for(int i=0;i<=nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}