import java.util.Arrays;

/** NetCracker courses
  * @author stud
 */
public class Lab01Sorting {
	private static long startTime;
	private static long sortDuration;

	public static void main(String[] args) {
		 
		 Sortable_intArray lab01=new Sortable_intArray();
	     System.out.println("before sorting");
	     ArrayView.print_all(lab01.a);
		 startTime = System.nanoTime();
		 lab01.bubbleSort();
		 sortDuration=System.nanoTime()-startTime;
		 System.out.println("sortDuration "+sortDuration);
		 
         System.out.println("after sorting");
	     ArrayView.print_all(lab01.a);
		 
	}
	
}//end Lab01Sorting