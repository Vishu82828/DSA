public class arrayfirsttwo {
    public static void update(int [] marks){
        for(int i= 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String [] args){
        int marks[] = new int[10];
        marks[0] = 98;
        marks[1] = 87;
        marks[2] = 77;

        update(marks);
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
