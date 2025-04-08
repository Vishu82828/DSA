import java.util.Scanner;

public class oddEvenFunction {
    public static boolean find(int num){
        return num%2==0;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check even = True or odd = False : ");
        int num = sc.nextInt();
        if(find(num)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
