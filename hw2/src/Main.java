public class Main {
    public static void main(String[] args) {
        int count= 0,s=0;
        int []nums={3,5,0,11,1};
        for(int v: nums){
            System.out.println(v);
           if (v!=0){
               s= s+1;
               count= count+1;

           }
        }
        if (count==0)
        System.out.println("Output is 0");
        else
        System.out.println("Output is "+ s/count);
    }
}