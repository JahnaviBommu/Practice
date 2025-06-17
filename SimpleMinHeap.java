import java.util.PriorityQueue;
public class SimpleMinHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();// Create a Min Heap using PriorityQueue
		 //Insert values into the Min Heap
        minHeap.add(45);
        minHeap.add(40);
        minHeap.add(35);
        minHeap.add(30);
		 //Print the heap contents(unordered)
		 System.out.println("Heap contents:");
        for (int val:minHeap){
            System.out.println(val);
        }
        System.out.println("Removing elements:");
        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll());//Removes and prints the smallest element
        }
    }
}
