import java.util.PriorityQueue;
public class PriorityQExample{
	public static void main(String[] args){
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.add(40);
		pq.add(50);
		pq.add(60);
		System.out.println("priority Queue:"+pq);
		System.out.println("Min:"+pq.peek());
		System.out.println("Remove Min:"+pq.poll());
		System.out.println("New Min:"+pq.peek());
	}
}
		
