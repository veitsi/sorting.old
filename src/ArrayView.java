
public class ArrayView {
    public static void print_all(int[] a) {
        for(int i=0;i<a.length;i++) {System.out.print(a[i]+" ");} 
        System.out.println();
      }
      public static void print_div(int[] a,int w) {
        for(int i=0;i<a.length;i++) {
            if (i==w) System.out.print("<"+a[i]+">");
            else System.out.print(a[i]+" ");
        } 
        System.out.println();
      }
}
