import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

       double[] vals={4.6, 63.0395, 0.00056573, 45, 1,23.90};
       double smallest=vals [0];
       for (double v: vals){
           if (v<smallest)
               smallest = v;
       }
        System.out.println(smallest);
    }
}