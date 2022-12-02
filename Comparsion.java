import java.util.ArrayList;
import java.util.LinkedList;

public class Comparsion {

    public static void main(String[] args) throws InterruptedException {
        int size = 150000;
        System.out.println("|| ArrayList || LinkedList ||");
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

	    System.out.print("Add  || ");
	    System.out.print(new Time().add_Time(arrayList, size));
	    System.out.print(" || ");
	    System.out.print( new Time().add_Time(linkedList, size));
	    System.out.println(" ||");
	
	    System.out.print("Get  || ");
	    System.out.print(new Time().get_Time(arrayList,  size));
	    System.out.print(" || ");
	    System.out.print(new Time().get_Time(linkedList,  size));
	    System.out.println(" ||");
	
	    System.out.print("Del  || ");
	    System.out.print(new Time().delete_Time(arrayList,  size));
	    System.out.print(" || ");
	    System.out.print(new Time().delete_Time(linkedList,  size));
	    System.out.println(" ||");
    }
}