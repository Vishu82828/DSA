public class arrayReversetwo {
    public static void reverse(int [] num){
        int start = 0; int end = num.length-1;
        while(start<end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start ++;
            end --;
        }
        
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        reverse(num);
        // system.out.println(reverse(num));
    }
}
