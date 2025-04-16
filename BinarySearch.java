public class BinarySearch {
    public static int binarySearch(int[] num, int key){
        int start = 0; int end = num.length - 1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start += 1;
            }else{
                end -= 1;
            }
        }
        return -1;
    }
    public static void main(String srgs []){
        int num[] = {1,2,3,4,5,6,7,8,9};
        int key = 2;
        System.out.println("Binary index is : "+ binarySearch(num,key));
    }
}
