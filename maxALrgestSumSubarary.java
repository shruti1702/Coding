public class maxALrgestSumSubarary {
    public static void main(String[] args) {
        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(largestsum(arr));
        System.out.println(maxSubArray(arr));
        
    }
    public static int largestsum(int arr[] ) {
        int ans =Integer.MIN_VALUE;
        int sum= 0;
        for ( final int num : arr) {
            sum=Math.max(num,sum+num);
            ans = Math.max(ans,sum);
        }
        return ans;
        
    }
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
    
        for (final int num : nums) {
          sum = Math.max(num, sum + num);
          ans = Math.max( ans, sum);
        }
    
        return ans;
            
        }
}
