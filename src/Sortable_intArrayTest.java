import static org.junit.Assert.*;

import org.junit.Test;

public class Sortable_intArrayTest {

	@Test
	public void normalArray() {
		Sortable_intArray lab01 = new Sortable_intArray(new int[]{1,7,3,1,0});
		lab01.bubbleSort();
        ArrayView.print_all(lab01.a);
        assertTrue("Arrays are not equal", java.util.Arrays.equals(lab01.a, new int[]{0,1,1,3,7}));
        
	}
	@Test
	public void singlenum() {
		Sortable_intArray lab01 = new Sortable_intArray(new int[]{0});
	}
	@Test
	public void emptyArray() {
		Sortable_intArray lab01 = new Sortable_intArray(new int[]{});
	}
	public void emptyArray2() {
		Sortable_intArray lab01 = new Sortable_intArray(0);
	}
	@Test
	public void onesArray() {
		Sortable_intArray lab01 = new Sortable_intArray(new int[]{1,1,1,1,1,1,1});
	}
	
	@Test
	public void bigArray() {
		try {
		Sortable_intArray lab01 = new Sortable_intArray(Integer.MAX_VALUE);
		}
		catch (OutOfMemoryError e) { 
            System.out.println("Невозможно создать массив размера "+Integer.MAX_VALUE); 
       } 
		
	}
}
