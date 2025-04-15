import java.util.*;
public class arrayIncressMarks {
    public static void update( int marks[] ){
        for(int i=0; i<marks.length; i++){
            marks[i] += 5;
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new  int[10];

        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        update(marks);

        System.out.println("marks : "+ Arrays.toString(marks));

        sc.close();
    }
}
