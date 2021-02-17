package lecture1;

public class hashtable<K,V> {
	private class htpair{
		K key;
		V val;
		htpair(K key,V val){
			this.key=key;
			this.val=val;
		}
		public boolean equals(Object obj)
		{
			htpair op=(htpair) obj;
			return this.key.equals(op);
		}
		public String toString()
		{
			return "{"+this.key+"-->"+this.val+"}";
		}
	}
	private LinkedList<htpair>[] bucketarray;
	private int size;
	public static final int defcap=10;
	
	public hashtable() {
		 this(defcap);
	}
	public hashtable(int capacity) {
		
	}
	
	

}
