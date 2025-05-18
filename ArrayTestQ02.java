public class ArrayTestQ02 {
    public static int  rotatedShortedArray(int num [], int target){
        int low = 0, high = num.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(num[mid] == target ){
                return mid;
            }
            else if(num[low]<=num[mid]){
                if(num[low]<=target && target<=num[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(num[mid]<= target && target <= num[high] ){
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num [] = {4,5,6,7,0,1,2};
        int target = 6;
        // rotatedShortedArray(num, target);

        int index = rotatedShortedArray(num, target);
        System.out.println("Index of target: " + index);
    }
}
