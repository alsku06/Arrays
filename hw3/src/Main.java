public class Main {
    public static void main(String[] args) {
        int n=1;
        int[]values={-3, 2,5, 4,7};
        boolean result= true;
        while (result && n<5){
            if (values[n]<values[n-1]){
                result=false;
            }
            n=n+1;
        }
        System.out.println(result);

    }
}