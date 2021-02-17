package lecture1;

public class quarrayclt {

	public static void main(String[] args) throws Exception {
	       
		quarray queue=new quarray();
			for(int i=0;i<7;i++)
			{
				queue.enqueue(i*10);
				queue.display();
				
			}

			System.out.println("front//");
			System.out.println(queue.front());
			System.out.println("size//");
			System.out.println(queue.size());
			System.out.println("dequeue//");
			queue.dequeue();
			queue.dequeue();
			queue.display();
			System.out.println(queue.size());
		    

	}

}
