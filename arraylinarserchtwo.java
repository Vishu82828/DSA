public class arraylinarserchtwo {
    public static int  search(int [] num, int key){
        for(int i=0; i<num.length; i++){
            if(key==num[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num [] = {34,56,12,10,11,98,70,89,72};
        int key = 11;
        int result = search(num,key);

        if(result != -1){
            System.out.println("key found on index : "+ result);
        } else {
            System.out.println("key not found.");
        }
    }
}
