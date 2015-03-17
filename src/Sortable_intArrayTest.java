import static org.junit.Assert.*;

import org.junit.Test;


public class Sortable_intArrayTest {

	@Test
	public void normalArray() {
		Sortable_intArray lab01 = new Sortable_intArray(new int[]{1,7,3,1,0});
        System.out.println("before sorting");
        lab01.print_all();
        lab01.bubbleSort();
        System.out.println("after sorting");
        lab01.print_all(); 
	}
	@Test
	public void singlenum() {
		Sortable_intArray lab01 = new Sortable_intArray(new int[]{0});
	}
	@Test
	public void emptyArray() {
		Sortable_intArray lab01 = new Sortable_intArray(new int[]{});
	}
	@Test
	public void onesArray() {
		Sortable_intArray lab01 = new Sortable_intArray(new int[]{1,1,1,1,1,1,1});
	}
	@Test
	public void bigArray() {
		Sortable_intArray lab01 = new Sortable_intArray(Integer.MAX_VALUE+1);
		
	}
}
