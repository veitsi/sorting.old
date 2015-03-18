import java.util.Arrays;

class Sortable_intArray{
	
	private boolean ascendOrder=true;
	public int[] a;
	
	public Sortable_intArray(int n){
		this.a=new int[n];
		this.fill_random();
	}
	public Sortable_intArray(){
		this.a=new int[20];
		this.fill_random();
	}
	
	public Sortable_intArray(int []ext){
		this.a=new int[ext.length];
		for (int i=0;i<a.length;i++) a[i]=ext[i];	
	}
	
	
    private void fill_random() {
        for (int i=0;i<a.length-1;i++)
        a[i]= randomInRange(0,50);
    }
    private double average() {
        int sum=0;
        for (int i=0;i<a.length;i++) sum+=a[i];
        return sum/a.length;
    }
    private int randomInRange(int a,int b) {
        return (int) ((int)a+Math.round(Math.random()*(b-a)));
    }
    private void swap(int i1,int i2) {
    int tmp=a[i1];
    a[i1]=a[i2];
    a[i2]=tmp;
    }
    public void bubbleSort() {
        boolean RepeatSorting = true;
        while (RepeatSorting){
            RepeatSorting=false;
            for (int i=0;i<a.length-1;i++) {
               if (a[i]>a[i+1]) {
                   RepeatSorting=true;
                   int tmp = a[i];
                   a[i]=a[i+1];
                   a[i+1]=tmp;
               }//end if
            }//end for
        }//end while
      }//end bubbleSort()
    
    public void bubbleSortRev(){
    	Arrays.sort(this.a);
    }
    
    public void obmenSort(){
    	Arrays.sort(this.a);
    }
    
    public void mergeSort(){
    	Arrays.sort(this.a);
    }
    
    public void recursDivsort(){
    	Arrays.sort(this.a);
    }
    
      public void minsort() {
      int min;
      int minpos;
      
      for (int i1=0;i1<a.length;i1++){
          minpos = i1;
          min=a[i1];
          for (int i2=i1+1;i2<a.length;i2++){
              if (a[i2]<min) {
                  min=a[i2];
                  minpos=i2;
              }//end if         
          }// end i2
          swap (i1,minpos);
      }// end i1
      System.out.println("choice sorting finished");
      
  }//end maxsort
      
      public void quicksort(int n,int m) {
          if ((m-n)<1) return;
          if ((m-n)==1) {
              if (a[m]<a[n]) swap(n,m);
              return;
          }
          int w = randomInRange(n+1,m-1);
          int i=n,j=m;

          do {
              for (;i<w;i++)if (a[i]>a[w]) break;
              for (;j>w;j--)if (a[j]<a[w]) break;
              swap (i,j);
              if (i==w) w=j;
              else if (j==w) w=i;
          } while(i!=j);
          
          quicksort(n,w-1);
          quicksort(w+1,m);
       }//end quicksort 
}
