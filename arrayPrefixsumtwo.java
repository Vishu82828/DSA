public class arrayPrefixsumtwo {
    public static void prefixsum(int num []){
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=1; i<num.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }
        // for(int i=0; i<prefix.length; i++){
        //     System.out.print(prefix[i]+", ");
        // }
        int maxsum = Integer.MIN_VALUE;
        int currentsum;
        for(int i =0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currentsum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                maxsum = maxsum<currentsum ? currentsum : maxsum;
            }
        }
        System.out.println("total sum : "+ maxsum);
    }
    public static void main(String [] args){
        int num[] = {2,4,6,8,10};
        prefixsum(num);
    }
}