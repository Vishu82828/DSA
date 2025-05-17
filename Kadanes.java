public class Kadanes {
    public static void kadanes(int num []){
        int curr = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            curr += num[i];
            if(curr > max){
                max = curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        System.out.println("Max is : "+max);
    }
    public static void main(String[] args) {
        int num[] = {-1,-3,5,-2,4,5,-4,-1};
        kadanes(num);
    }
}
