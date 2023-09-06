public class Main {
    public static void main(String[] args) {

        boolean isArith= true;

        int[]arr= {-1,6,3,5,7};
        int v= arr[1]-arr[0];

        for (int i =2; i<arr.length&& isArith; i++){
            int diff= arr[i]-arr[i-1];
            if (diff!=v)
                isArith= false;
        }
        System.out.println(isArith);
    }
}