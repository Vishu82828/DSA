public class BubbleShort {
    public static void arrShorting(int arr []){
        // first loop count term, i = term
        for(int i = 0; i<arr.length-1; i++){
            // this loop minus the term from the array so that i dont do the shorted array again
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void arrPrint(int arr []){
        // this is used to print the answer only
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        arrShorting(arr);
        arrPrint(arr);
    }
}
