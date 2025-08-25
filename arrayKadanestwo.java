class arrayKadanestwo {
    public static void kadanes(int num []){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            currSum += num[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("total sum : "+maxSum);
    }
    public static void main(String [] args){
        int num[] = {-2 ,-3 ,4 ,-1 ,-2 ,1 ,5 ,-3 };
        kadanes(num);
    }
}