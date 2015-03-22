import java.util.Arrays;

/** NetCracker courses
  * @author stud
 */
public class Lab01Sorting {
	private static long startTime;
	private static long sortDuration;

	public static void main(String[] args) {
		Sortable_intArray[] tracks={new BubbleRev(), new Quick(), new Merge()};
		
		//ArrayView.print_all(new ArrayFiller().fill(20));
		 Sortable_intArray lab01=new BubbleRev(new ArrayFiller());
	     System.out.println("before sorting");
	     ArrayView.print_all(lab01.a);
		 startTime = System.nanoTime();
		 lab01.sort();
		 sortDuration=System.nanoTime()-startTime;
		 System.out.println("sortDuration "+sortDuration);
		 
         System.out.println("after sorting");
	     ArrayView.print_all(lab01.a);
		 
	}
	
}//end Lab01Sorting