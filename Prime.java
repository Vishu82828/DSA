// public class Prime {
//     public static void main ( String[] args){
//         int n = 7;
//         int i;
//        for( i = 2; i<=n-1 ; i++){
//         if(n % i == 0){
//             System.out.println("non prime");
//             break;
//         }
//         else {
//             System.out.println("prime");
//             break;
//         }
//        }
//     }
// }

public  class Prime {
    public static void main (String [] args){
        int n = 12;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("non-prime");
                break;
            }
            else {
                System.out.println("prime");
                break;
            }
        }
    }
}