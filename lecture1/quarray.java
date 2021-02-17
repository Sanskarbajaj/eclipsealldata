package lecture1;

public class quarray {
       int[] data;
       int size,front;
       final static int defcap=10;
       public quarray() throws Exception{
		this(defcap);
	}
       quarray(int capacity) throws Exception{
   		if(capacity<=0)
   		{
   			throw new Exception("invalid capacity");
   		}
    	   this.data=new int[capacity];
    	   this.front=0;
    	   this.size=0;
       }
       public boolean isempty()
   	{
             if(size==0)
           	  return true;
             else
           	  return false;
   	}
       public void enqueue(int item) throws Exception{
   		if(this.data.length==this.size)
   		{
   			throw new Exception("hatt b$Dk");
   		}
   		int avl=(this.front+this.size)%this.data.length;
   		this.data[avl]=item;
   		this.size++;
   	}
       public int dequeue() throws Exception
   	{
   		if(size==0)
   		{
   			throw new Exception("khali hai bhai");
   		}
   		int res=data[front];
   		data[front]=0;
   		this.front = (this.front + 1) % this.data.length;
   		this.size--;
   		return res;
   		
   	}
   	public int size()
   	{
   		return this.size;
   	}
   	public int front() throws Exception
	{
		if(size==0)
		{
			throw new Exception("khali hai bhai");
		}
		int res=data[front];
   		return res;
	}
   	public void display()
	{
   		for (int i = 0; i < this.size; i++) {
			int avl = (this.front + i) % this.data.length;
			System.out.print(this.data[avl]+" ");
		}
		System.out.println();
	}
}
