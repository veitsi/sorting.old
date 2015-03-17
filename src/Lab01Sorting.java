import java.util.Arrays;

/** NetCracker courses
  * @author stud
 */
public class Lab01Sorting {
    public static void main(String[] args) {
    
    	Sortable_intArray lab01 = new Sortable_intArray();
        System.out.println("before sorting");
        lab01.print_all();
        lab01.bubbleSort();
        System.out.println("after sorting");
        lab01.print_all();   
        
        //for user's array
        System.out.println("for user's array");
        lab01 = new Sortable_intArray(new int[]{1,7,3,1,0});
        System.out.println("before sorting");
        lab01.print_all();
        lab01.bubbleSort();
        System.out.println("after sorting");
        lab01.print_all(); 
        
        //lab01.quicksort(0, lab01.a.length-1);
        //lab01.minsort();
//        long time1 = System.nanoTime();
//        Arrays.sort(lab01.a);
//        System.out.println("time per element "+(time2-time1)/lab01.a.length);
    }  
}//end Lab01Sorting