import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[]vals= {2,5,-3, 11, 193,-2};
        System.out.print(Arrays.toString(vals) + ", ");
        int a = Arrays.stream(vals).sum();
        System.out.println(a );

        int c= vals[0];
        int i,sum;
        sum=0;
        for(int v: vals){
            System.out.print(v+" ");
            sum = sum + v;
        }
        System.out.println();
        System.out.println("Sum is: " + sum);
    }
}
