public class Main {
    public static void main(String[] args) {
      int[] in={5,6,2,-4, 116, 25,-88};
      int [] out= new int[in.length -1 ];
        for(int n=0; n<=in.length-2; n=n+1)
            out[n]=in[n+1]-in[n];

      for (int o: out)

          System.out.print(o+", ");
    }
}