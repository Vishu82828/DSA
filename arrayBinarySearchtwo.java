public class arrayBinarySearchtwo {
    public static void binary(int [] num, int key) {
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(num[mid]==key){
                System.out.println("key found at index : "+ mid);
                return;
            } else if(num[mid]>key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16,18};
        int key = 10;
        binary(num, key);
    }
}
