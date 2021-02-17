package dsa;

public class HashTable<K,V> {
	public class pair
	{
		K key;
		V value;
		public pair(K key,V value) {
			this.key=key;
			this.value=value;
		}
		@Override
		public boolean equals(Object obj) {
			pair op=(pair)obj;
			
			return this.key.equals(op.key);
		}
		@Override
		public String toString() {
			
			return "{"+this.key+"->"+this.value+"}";
		}
	}
	llimpl<pair>bucketarray[];
	int size;
	public static final int defcap=10;
	public HashTable()
	{
		this(defcap);
	}
	public HashTable(int capacity) {
		bucketarray=(llimpl<pair>[])new llimpl[capacity];
		this.size=0;
	}
	public void put(K key, V value) throws Exception {
		int bi = this.hashcode(key);
		llimpl<pair> bucket = this.bucketarray[bi];
		pair pta = new pair(key, value);
		if (bucket == null) {
			bucket = new llimpl<>();
			bucket.addLast(pta);
			this.size++;
			this.bucketarray[bi] = bucket;
		} else {
			int findAt = bucket.find(pta);
			if (findAt == -1) {
				bucket.addLast(pta);
				this.size++;
			} else {
				pair p = bucket.getAt(findAt);
				p.value = value;
			}
		}

		double lamda = (this.size * 1.0) / this.bucketarray.length;
		if (lamda > 0.75) {
			this.rehash();
		}

	}
	public V get(K key) throws Exception
	{
		int bi=this.hashcode(key);
		llimpl<pair>bucket;
		bucket=this.bucketarray[bi];
		pair ptg=new pair(key,null);
		if(bucket==null)
			return null;
		else
		{
			int findat=bucket.find(ptg);
			if(findat==-1)
			{
				return null;
			}
			else
			{
				return bucket.getAt(findat).value;
			}
		}
		
	}
	public V remove(K key) throws Exception
	{
		int bi=this.hashcode(key);
		llimpl<pair>bucket;
		bucket=this.bucketarray[bi];
		pair ptd=new pair(key,null);
		if(bucket==null)
			return null;
		else
		{
			int findat=bucket.find(ptd);
			if(findat==-1)
				return null;
			else
			{
				pair p=bucket.removeat(findat);
				this.size--;
				return p.value;
			}
		}
		
	}
	public void display() {
		for (llimpl<pair> bucket : this.bucketarray) {
			if (bucket != null && !bucket.isempty()) {
				bucket.display();
			} else {
				System.out.println("NULL");
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		System.out.println("***********************************");
	}
	private void rehash() throws Exception {
		llimpl<pair>[] oba = this.bucketarray;
		this.bucketarray = (llimpl<pair>[]) new llimpl[2 * oba.length];
		;
		this.size = 0;

		for (llimpl<pair> ob : oba) {
			while (ob != null && !ob.isempty()) {
				pair pai = ob.removefirst();
				this.put(pai.key, pai.value);
			}
		}

	}
	public int hashcode(K key)
	{
		int hc=key.hashCode();
		hc=Math.abs(hc);
		int bi=hc%bucketarray.length;
	return bi;}
	public static void main(String[] args) throws Exception {
	HashTable<Integer,Integer> hm=new HashTable<>();
	hm.put(1,1);
	hm.put(1, 2);
	hm.put(3, 13);
	System.out.println(hm.get(3));
	System.out.println(hm.size);
	System.out.println(hm.remove(3));
	
		
	}

}
