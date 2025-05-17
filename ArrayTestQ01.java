public class ArrayTestQ01 {
    public static void similar(int num []){ 
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]==num[j]){
                    System.out.println("True");
                    return;
                }
                
            }
        }
        System.out.println("False");
    }
    public static void main(String[] args) {
        int num [] = {1,1,1,3,3,4,3,2,4,2};
        similar(num);
    }
}
