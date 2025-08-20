public class arraylargesttwo {
    public static int largest(int [] num){
        int smallest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(smallest<num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int num[] = {10,12,14,15,98,99,86,87,70};
        // largest(num);

        System.out.println("largest num is : "+ largest(num));
    }
}
