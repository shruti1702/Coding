public class chechDupilacate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Dupilcates(arr));
        System.out.println(findDupicateInArray(arr));
    }
        

   
    public static boolean Dupilcates(int[]num){
        int n = num.length;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
        
        
    }
    public static boolean findDupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
        }
        if(count>0){
            return true;
        }
        return false;
    }
}
