import java.util.Arrays;

class ArrayFiller {
	int[] a=null;
	public ArrayFiller(){
		
	}
	public int[] getArray(int n){
		this.a=new int[n];
		int i;
		for (i=0;i<n-1;i++) this.a[i]= randomInRange(0,50);
		return this.a;
	}
	
    private int randomInRange(int a,int b) {
        return (int) ((int)a+Math.round(Math.random()*(b-a)));
    }

}



class SortedSeq extends ArrayFiller{
	public int[] getArray(int n){
		a=super.getArray(n);
		Arrays.sort(a);
		return a;
	}
}

class SortedWithLast extends ArrayFiller{
	
}

class CounterSorted extends ArrayFiller{
	
}

class Random extends ArrayFiller{

}
