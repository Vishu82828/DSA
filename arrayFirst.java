import  java.util.*;
public class arrayFirst {
    // public void printOutput(){

    // }
    public static void main(String[]args){
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("First : " + marks[0]);
        System.out.println("Second : " + marks[1]);
        System.out.println("Third : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage of tottal : "+percentage + "%");
    }
}
