package dsa;

import java.util.Vector;

public class qimpl<T> {
	public int[] data;
	int front,size;
	public static  final int defcap=10;
	public qimpl() {
	this(defcap);
	}
	public qimpl(int capacity)
	{
		this.data=new int[capacity];
		this.front=0;
		this.size=0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	public void enqueue(int item) throws Exception
	{
		int ind=(this.front+this.size())%data.length;
	data[ind]=item;
		this.size++;
	}
	public int dequeue()
	{
	  int rv= data[front];
		data[front]=0;
		front=(front+1)%(data.length);
		this.size--;
	return rv;}
	public void display()
	{
		for(int i=0;i<this.size();i++)
		{
			int indx=(this.front+i)%data.length;
			System.out.print(data[indx]+"->");
		}
		System.out.println();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		qimpl<Integer> q=new qimpl<>();
		System.out.println(q.isempty());
		System.out.println(q.size());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.isempty());
		System.out.println(q.size());
		System.out.println();
		q.display();
		System.out.println(q.dequeue());
		q.display();
	}

}
