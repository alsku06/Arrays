public class Main {
    public static void main(String[] args) {
        int []arr= {4, -3, -5, 9, 1, 11};
        int [] smaller= new int[arr.length];
        int m =1;
        int index=0;
        for (int n=0; n<=arr.length-1; n=n+1){
            if (arr[n]>m)
                System.out.print(arr[n ]+ " ");
            else if(arr[n]<m){
                smaller[index]=arr[n];
                 index=index+1;
            }


        }

        System.out.println();
        for(int n=0; n<index;n++)

            System.out.print(smaller[n] +" ");
    }
}