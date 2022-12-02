import java.util.List;

public class Time {

    /**
     * Method that measures execution time of adding elements
     * @param list (ArrayList or LinkedList)
     * @param size amount of elements in list
     * @return measured time in milliseconds
     * @throws InterruptedException 
     */
    public long add_Time(List list, int size) throws InterruptedException{
    	long start = System.nanoTime();
    	for(int i = 0; i < size; i++){
            list.add(i);
        }
    	Thread.sleep(1000);
    	long finish = System.nanoTime();
    	return (finish - start) / 1000000;
    }
    
    /**
     * Method that measures execution time of getting elements
     * @param list (ArrayList or LinkedList)
     * @param size amount of elements in list
     * @return measured time in milliseconds
     * @throws InterruptedException 
     */
    public long get_Time(List list, int size) throws InterruptedException{
    	long start = System.nanoTime();
        for(int i = 0; i < size; i++){
            int elem = (int)list.get(i);
        }
        Thread.sleep(1000);
        long finish = System.nanoTime();
        return (finish - start) / 1000000;
    }

    /**
     * Method that measures execution time of deleting elements
     * @param list (ArrayList or LinkedList)
     * @param size amount of elements in list
     * @return measured time in milliseconds
     * @throws InterruptedException 
     */
    public long delete_Time(List list, int size) throws InterruptedException{
    	long start = System.nanoTime();
        for(int i = size - 1; i >= 0; i--){
            list.remove(i);
        }
        Thread.sleep(1000);
        long finish = System.nanoTime();
    	return (finish - start) / 1000000;
    }
}