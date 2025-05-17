public class SubArray {
    public static void subArray(int num []){
        int tc = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                int curr = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(num[k]+" ");
                    curr += num[k];
                    tc++;
                }
                System.out.println();
                System.out.println("Sum of Pair = "+curr);
                if(max<curr){
                    max = curr;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Pair : "+tc+ " max = "+max);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subArray(num);
    }
}
