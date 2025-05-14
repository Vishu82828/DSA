public class PairArray {
    public static void  pairArray(int [] num){
        for(int i=0; i<num.length-1;i++){
            int curr = i;
            for(int j = curr+1; j<num.length; j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] num = {2,4,6,8,10};
        pairArray(num);
    }
}
