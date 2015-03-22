import java.util.Arrays;

/** NetCracker courses
  * @author stud
 */
public class Lab01Sorting {
	private static long startTime;
	private static long sortDuration;

	public static void main(String[] args) {
		Sortable_intArray[] s={new Quick(), new Obmen()};
		ArrayFiller[] af={new SortedWithLast(), 
				new CounterSorted(), new Random()
		};
		int n=20;
		int []a=new int[n];
		Sortable_intArray lab01;
		
		for (int i=0;i<s.length;i++)
			for (int j=0;j<af.length;j++){
		//ArrayView.print_all(new ArrayFiller().fill(20));
		 //Sortable_intArray lab01 = new Sortable_intArray(new int[]{1,7,3,1,0});
		 //Sortable_intArray lab01 = new Obmen(af[0]);
		a=af[j].getArray(n);
	    System.out.println("before sorting");
	    ArrayView.print_all(a);
		startTime = System.nanoTime();
		
		
		lab01 = s[i];
		a=lab01.getSorted(a);
		 sortDuration=System.nanoTime()-startTime;
		 System.out.println("sortDuration "+sortDuration);
		 
         System.out.println("after sorting");
	     ArrayView.print_all(a);
		}
	}
	
}//end Lab01Sorting