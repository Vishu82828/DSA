public class SelectionShort {
    public static void arrSelection(int arr []){
        for(int term = 0; term < arr.length; term++){
            int minum = term;
            for(int j=term+1; j<arr.length; j++){
                if(arr[minum]>arr[j]){
                    minum = j;
                }
            }
            int temp = arr[minum];
            arr[minum] = arr[term];
            arr[term] = temp;
        }
    }

    public static void ArrPrint(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        arrSelection( arr);
        ArrPrint(arr);
    }
}
