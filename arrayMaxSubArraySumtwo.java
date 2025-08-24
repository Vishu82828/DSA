public class arrayMaxSubArraySumtwo {
    public static void subArrySum(int [] num){
        int currsum ;
        int Maxsum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currsum = 0;
                for(int k=i; k<=j; k++){
                    currsum += num[k];
                }
                if(Maxsum<currsum){
                    Maxsum = currsum;
                }
                System.out.println("Current Sum : "+currsum);
            }
        }
        System.out.println("Total sum of pair array : "+Maxsum);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subArrySum(num);
    }
}
