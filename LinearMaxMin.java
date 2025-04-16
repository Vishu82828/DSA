public class LinearMaxMin {
    public static int linearMax(int[] num) {
        int smallNum = Integer.MIN_VALUE;
        for(int i=0; i< num.length; i++){
            if(num[i]>smallNum){
                smallNum=num[i];
            }
        }
        return smallNum;
    }
    public static int linearMin(int[] num){
        int largestNum = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]<largestNum){
                largestNum = num[i];
            }
        }
        return largestNum;
    }  
    public static void main(String args[]){
        int num[] = {34,67,98,45,99,20};
        int Max = linearMax(num);
        int Min = linearMin(num); 

        System.out.println("Max" + Max);
        System.out.println("Max" + Min);
    }
}
