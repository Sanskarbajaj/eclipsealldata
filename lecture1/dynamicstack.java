package lecture1;
import lecture1.stkuarray;
public class dynamicstack extends stkuarray {

	public dynamicstack() throws Exception {
		this(decap);
	}
	public dynamicstack(int capacity) throws Exception {
		super(capacity);
	}
	public void push(int element)  {
		if(tos==data.length-1)
		{
			inc();
		}
		tos++;
		this.data[tos]=element;

		
	}
	public void inc()
	{
		 int[] newStack = new int[this.data.length*2];
	        for(int i=0;i<data.length;i++){
	            newStack[i] = this.data[i];
	        }
	        this.data = newStack;
	        this.data.length = this.newStack.length*2;
	}

	}
